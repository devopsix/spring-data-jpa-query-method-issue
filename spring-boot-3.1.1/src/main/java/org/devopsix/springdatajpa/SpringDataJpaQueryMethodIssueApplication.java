package org.devopsix.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringDataJpaQueryMethodIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaQueryMethodIssueApplication.class, args);
	}
}
