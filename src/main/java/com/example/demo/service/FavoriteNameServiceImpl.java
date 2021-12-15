package com.example.demo.service;

import com.example.demo.domain.entities.FavoriteName;
import com.example.demo.domain.models.service.UserServiceModel;
import com.example.demo.repository.FavoriteNameRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteNameServiceImpl implements FavoriteNameService {


    private final ModelMapper modelMapper;
    private final FavoriteNameRepository favoriteNameRepository;

    @Autowired
    public FavoriteNameServiceImpl(ModelMapper modelMapper, FavoriteNameRepository favoriteNameRepository) {
        this.modelMapper = modelMapper;
        this.favoriteNameRepository = favoriteNameRepository;
    }


    @Override
    public UserServiceModel saveName(UserServiceModel userServiceModel) {
        FavoriteName favoriteName= this.modelMapper.map(userServiceModel, FavoriteName.class);
        return this.modelMapper.map(this.favoriteNameRepository.saveAndFlush(favoriteName), UserServiceModel.class);
    }
}
