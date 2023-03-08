package com.bartendersbible.bartendersbiblefinal.controller;

import com.bartendersbible.bartendersbiblefinal.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;
}
