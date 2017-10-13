package com.greenfox.services;

import com.greenfox.models.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Page<Recipe> findAllByOrderByName(Pageable pageable);

}
