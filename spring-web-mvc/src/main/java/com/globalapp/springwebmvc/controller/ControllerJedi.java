package com.globalapp.springwebmvc.controller;

import javax.validation.Valid;

import com.globalapp.springwebmvc.model.Jedi;
import com.globalapp.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerJedi {

    @Autowired
    private JediRepository jediRepository;

    @GetMapping("/jedi")
    public ModelAndView jedi(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        modelAndView.addObject("allJedi", jediRepository.getJediRepository());

        return modelAndView;
    }

    @GetMapping("/new-jedi")
    public ModelAndView newJedi(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new_jedi");

        modelAndView.addObject("jedi", new Jedi());

        return modelAndView;
    }

    @PostMapping("/jedi")
    public String createJedi(@Valid @ModelAttribute Jedi jedi, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "new_jedi";
        }

        jediRepository.add(jedi);

        return "redirect:jedi";
    }
}
