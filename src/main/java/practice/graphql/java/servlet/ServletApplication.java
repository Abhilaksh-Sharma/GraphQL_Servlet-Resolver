package practice.graphql.java.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import practice.graphql.java.servlet.repo.GraphQLServletRepository;
import practice.graphql.java.servlet.resolver.MutationResolver;
import practice.graphql.java.servlet.resolver.QueryResolver;

@SpringBootApplication
@ServletComponentScan
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
