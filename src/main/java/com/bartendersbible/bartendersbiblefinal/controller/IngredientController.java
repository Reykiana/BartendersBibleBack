package com.bartendersbible.bartendersbiblefinal.controller;

import com.bartendersbible.bartendersbiblefinal.repositories.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ingredient")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;
}
