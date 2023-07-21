package org.devopsix.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BaseArticleRepositoryTest {

    @Autowired
    private BaseArticleRepository baseArticleRepository;

    @Test
    void test() {
        baseArticleRepository.search(1L);
    }
}
