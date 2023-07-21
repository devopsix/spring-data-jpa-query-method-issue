package org.devopsix.springdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public abstract class Article<C extends ArticleCustomization<? extends Article<C>>> extends BaseArticle {

    @OneToMany(mappedBy = "article", targetEntity = ArticleCustomization.class)
    private Set<C> customizations;

    public Set<C> getCustomizations() {
        return customizations;
    }

    public void setCustomizations(Set<C> customizations) {
        this.customizations = customizations;
    }
}
