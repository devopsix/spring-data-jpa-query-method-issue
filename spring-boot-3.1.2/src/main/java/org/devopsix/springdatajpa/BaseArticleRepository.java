package org.devopsix.springdatajpa;

import org.springframework.data.repository.CrudRepository;

public interface BaseArticleRepository extends CrudRepository<BaseArticle, Long>, BaseArticleRepositoryCustom {
}
