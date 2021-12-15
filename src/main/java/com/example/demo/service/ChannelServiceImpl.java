package com.example.demo.service;

import com.example.demo.domain.entities.tv.Channel;
import com.example.demo.domain.models.service.UserServiceModel;
import com.example.demo.repository.ChannelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelServiceImpl implements  ChannelService {

    private final ModelMapper modelMapper;
    private final ChannelRepository channelRepository;

    @Autowired
    public ChannelServiceImpl(ModelMapper modelMapper, ChannelRepository channelRepository) {
        this.modelMapper = modelMapper;
        this.channelRepository = channelRepository;
    }

    @Override
   public UserServiceModel saveChannel(UserServiceModel userServiceModel) {


        Channel channel = this.modelMapper.map(userServiceModel, Channel.class);

        return this.modelMapper.map(this.channelRepository.saveAndFlush(channel), UserServiceModel.class);

    }
}
