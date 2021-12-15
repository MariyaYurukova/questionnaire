package com.example.demo.service;

import com.example.demo.domain.models.service.UserServiceModel;

public interface UserService {

    UserServiceModel saveUser(UserServiceModel userServiceModel);

    UserServiceModel getGetUserById(String id);
}
