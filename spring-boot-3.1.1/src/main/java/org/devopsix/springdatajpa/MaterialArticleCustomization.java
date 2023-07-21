package org.devopsix.springdatajpa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MATERIAL")
public class MaterialArticleCustomization extends ArticleCustomization<MaterialArticle> {
}
