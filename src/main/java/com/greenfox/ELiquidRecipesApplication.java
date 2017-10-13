package com.greenfox;

import com.greenfox.models.Recipe;
import com.greenfox.services.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ELiquidRecipesApplication implements CommandLineRunner {

	@Autowired
	RecipeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ELiquidRecipesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
