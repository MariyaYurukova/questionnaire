package com.example.demo.service;


import com.example.demo.domain.entities.Job;
import com.example.demo.domain.entities.Season;
import com.example.demo.domain.entities.User.User;
import com.example.demo.domain.entities.tv.Channel;
import com.example.demo.domain.models.service.JobServiceModel;
import com.example.demo.domain.models.service.UserServiceModel;
import com.example.demo.repository.ChannelRepository;
import com.example.demo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final ModelMapper modelMapper;


    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;

    }


    @Override
    public UserServiceModel saveUser(UserServiceModel userServiceModel) {
        User user= this.modelMapper.map(userServiceModel, User.class);
        return  modelMapper.map(this.userRepository.saveAndFlush(user), UserServiceModel.class);

    }


    @Override
    public UserServiceModel getGetUserById(String id) {
        User user= this.userRepository.findById(id).get();
        return  this.modelMapper.map(user, UserServiceModel.class);
    }
}
