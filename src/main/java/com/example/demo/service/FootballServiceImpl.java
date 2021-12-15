package com.example.demo.service;

import com.example.demo.domain.entities.football.Football;
import com.example.demo.domain.models.service.UserServiceModel;
import com.example.demo.repository.FootballRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class FootballServiceImpl  implements  FootballService{

   private final ModelMapper modelMapper;
   private final FootballRepository footballRepository;

    public FootballServiceImpl(ModelMapper modelMapper, FootballRepository footballRepository) {
        this.modelMapper = modelMapper;
        this.footballRepository = footballRepository;
    }

    @Override
    public UserServiceModel saveFootballTeam(UserServiceModel userServiceModel) {

        Football football=this.modelMapper.map(userServiceModel, Football.class);
        return  this.modelMapper.map(this.footballRepository.saveAndFlush(football), UserServiceModel.class);
    }
}
