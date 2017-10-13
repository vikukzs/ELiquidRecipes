package com.greenfox.services;

import com.greenfox.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Service
public class RecipeServices {
    @Autowired
    RecipeRepository repository;

    Recipe recipe;

    public Page<Recipe> sortRecipes(Integer page, Integer limit) {
        return repository.findAllByOrderByName(new PageRequest(page, limit));
    }

    public void save(Recipe recipe) {
        repository.save(recipe);
    }
    public void delete(Long id) {
        repository.delete(id);
    }
    public Recipe findARecipe(long id) {
        return repository.findOne(id);
    }
    public void upvote(Long id){
        recipe = repository.findOne(id);
        recipe.rating++;
        save(recipe);
    }
    public void downvote(Long id){
        recipe = repository.findOne(id);
        recipe.rating--;
        save(recipe);
    }

}
