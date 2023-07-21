package org.devopsix.springdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;

import static jakarta.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Inheritance(strategy = SINGLE_TABLE)
public abstract class BaseArticle extends BaseEntity {
}
