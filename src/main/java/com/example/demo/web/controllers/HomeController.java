package com.example.demo.web.controllers;

import com.example.demo.domain.models.binding.AddDrinkReqModel;
import com.example.demo.domain.models.binding.AddJobReqModel;
import com.example.demo.domain.models.binding.AddUserReqModel;
import com.example.demo.domain.models.service.DrinkingServiceModel;
import com.example.demo.domain.models.service.JobServiceModel;
import com.example.demo.domain.models.service.UserServiceModel;
import com.example.demo.domain.models.views.DrinkViewModel;
import com.example.demo.domain.models.views.JobViewModel;
import com.example.demo.domain.models.views.QuestionViewModel;
import com.example.demo.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;

@Controller
public class HomeController extends BaseController {


    private final ModelMapper modelMapper;
    private final WorkService workService;
    private final UserService userService;
    private final ChannelService channelService;
    private final FootballService footballService;
    private final FavoriteNameService favoriteNameService;
    private final DrinkService drinkService;


    @Autowired
    public HomeController(ModelMapper modelMapper,
                          WorkService workService, UserService userService,
                          ChannelService channelService, FootballService footballService,
                          FavoriteNameService favoriteNameService, DrinkService drinkService) {
        this.modelMapper = modelMapper;
        this.workService = workService;
        this.userService = userService;
        this.channelService = channelService;
        this.footballService = footballService;
        this.favoriteNameService = favoriteNameService;
        this.drinkService = drinkService;
    }


    @GetMapping("/")
    public ModelAndView home(){
        return super.view("index");
    }


    @GetMapping("/question")
    public ModelAndView question(ModelAndView modelAndView, @ModelAttribute (name="model") AddUserReqModel model ){
    modelAndView.addObject("model", model);


        return super.view("question", modelAndView);
    }

    @PostMapping("/question")
    public ModelAndView addConfirm(@Valid @ModelAttribute(name = "model") AddUserReqModel model, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("model", model);
            return super.view("question", modelAndView);
        }

        UserServiceModel userServiceModel = this.modelMapper.map(model, UserServiceModel.class);
        this.userService.saveUser(userServiceModel);
        this.channelService.saveChannel(userServiceModel);
        this.footballService.saveFootballTeam(userServiceModel);
        this.favoriteNameService.saveName(userServiceModel);
        return super.view("/detailsQuestion", modelAndView);
    }

    @GetMapping("/question/{id}")
    public ModelAndView detailsUser(@PathVariable String id, ModelAndView modelAndView) {
       QuestionViewModel questionViewModel = this.modelMapper.map(this.userService.getGetUserById(id) , QuestionViewModel.class);

        modelAndView.addObject("model", questionViewModel);

        return super.view("detailsQuestion", modelAndView);
    }



    @GetMapping("/job")
    public ModelAndView job(ModelAndView modelAndView, @ModelAttribute (name="model") AddJobReqModel model ){
        modelAndView.addObject("model", model);
        return super.view("job", modelAndView);
    }


    @PostMapping("/job")
    public ModelAndView addConfirm(@Valid @ModelAttribute(name = "model") AddJobReqModel model, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("model", model);
            return super.view("job", modelAndView);
        }

        JobServiceModel jobServiceModel = this.modelMapper.map(model, JobServiceModel.class);

        this.workService.saveJob(jobServiceModel);
        return super.view("/details", modelAndView);
    }





    @GetMapping("/job/{id}")
    public ModelAndView detailsCitizen(@PathVariable String id, ModelAndView modelAndView) {
      JobViewModel job = this.modelMapper.map(this.workService.getGetJobById(id) , JobViewModel.class);

       modelAndView.addObject("model", job);

        return super.view("details", modelAndView);
    }





    @GetMapping("/drink")
    public ModelAndView drink(ModelAndView modelAndView, @ModelAttribute (name="model") AddDrinkReqModel model ){
        modelAndView.addObject("model", model);
        return super.view("drink", modelAndView);
    }

    @PostMapping("/drink")
    public ModelAndView addConfirm(@Valid @ModelAttribute(name = "model") AddDrinkReqModel model, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("model", model);
            return super.view("drink", modelAndView);
        }

        DrinkingServiceModel drinkServiceModel = this.modelMapper.map(model, DrinkingServiceModel.class);
        this.drinkService.saveDrink(drinkServiceModel);

        return super.view("/detailsDrink", modelAndView);
    }


    @GetMapping("/drink/{id}")
    public ModelAndView detailsDrink(@PathVariable String id, ModelAndView modelAndView) {
        DrinkViewModel job = this.modelMapper.map(this.drinkService.getGetDrinkById(id) , DrinkViewModel.class);

        modelAndView.addObject("model", job);

        return super.view("detailsDrink", modelAndView);
    }

}
