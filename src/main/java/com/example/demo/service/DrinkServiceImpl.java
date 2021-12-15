package com.example.demo.service;

import com.example.demo.domain.entities.Job;
import com.example.demo.domain.entities.drinking.Drink;
import com.example.demo.domain.models.service.DrinkingServiceModel;
import com.example.demo.domain.models.service.JobServiceModel;
import com.example.demo.repository.DrinkRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkServiceImpl implements DrinkService {

    private final ModelMapper modelMapper;
    private final DrinkRepository drinkRepository;

    @Autowired
    public DrinkServiceImpl(ModelMapper modelMapper, DrinkRepository drinkRepository) {
        this.modelMapper = modelMapper;
        this.drinkRepository = drinkRepository;
    }

    @Override
    public DrinkingServiceModel saveDrink(DrinkingServiceModel drinkingServiceModel){
      Drink drink = this.modelMapper.map(drinkingServiceModel, Drink.class);
      return this.modelMapper.map(this.drinkRepository.saveAndFlush(drink), DrinkingServiceModel.class);
  }



    @Override
    public DrinkingServiceModel getGetDrinkById(String id) {
        Drink drink= this.drinkRepository.findById(id).get();
        return  this.modelMapper.map(drink, DrinkingServiceModel.class);
    }

}
