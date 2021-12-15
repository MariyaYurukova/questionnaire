package com.example.demo.service;

import com.example.demo.domain.models.service.DrinkingServiceModel;

public interface DrinkService {

    DrinkingServiceModel saveDrink(DrinkingServiceModel drinkingServiceModel);

    DrinkingServiceModel getGetDrinkById(String id);
}
