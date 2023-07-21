package org.devopsix.springdatajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

import java.util.List;

import static jakarta.persistence.criteria.JoinType.LEFT;

public class BaseArticleRepositoryCustomImpl implements BaseArticleRepositoryCustom {

    private final EntityManager entityManager;

    public BaseArticleRepositoryCustomImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public List<BaseArticle> search(Long accountId) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<BaseArticle> cq = cb.createQuery((Class)BaseArticle.class);
        Root<BaseArticle> article = cq.from((Class)BaseArticle.class);
        // customizations is not a field of BaseArticle but of Article!
        Join<BaseArticle, ArticleCustomization<?>> customizations = article.join("customizations", LEFT);
        customizations.on(cb.equal(customizations.get("account").get("id"), accountId));
        TypedQuery<BaseArticle> query = entityManager.createQuery(cq);
        return query.getResultList();
    }
}
