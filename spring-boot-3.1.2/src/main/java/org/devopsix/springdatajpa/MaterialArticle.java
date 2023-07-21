package org.devopsix.springdatajpa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DEFAULT")
public class MaterialArticle extends Article<MaterialArticleCustomization> {
}
