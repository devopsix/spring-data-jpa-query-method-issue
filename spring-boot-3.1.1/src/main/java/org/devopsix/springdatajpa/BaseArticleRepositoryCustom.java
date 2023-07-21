package org.devopsix.springdatajpa;

import java.util.List;

public interface BaseArticleRepositoryCustom {

    List<BaseArticle> search(Long accountId);
}
