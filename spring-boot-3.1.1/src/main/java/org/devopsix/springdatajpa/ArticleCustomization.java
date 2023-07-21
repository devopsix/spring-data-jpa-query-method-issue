package org.devopsix.springdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Inheritance(strategy = SINGLE_TABLE)
public abstract class ArticleCustomization<A extends Article<? extends ArticleCustomization<A>>> extends BaseEntity {

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = LAZY, targetEntity = Article.class)
    @JoinColumn(name = "article_id")
    private A article;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public A getArticle() {
        return article;
    }

    public void setArticle(A article) {
        this.article = article;
    }
}

