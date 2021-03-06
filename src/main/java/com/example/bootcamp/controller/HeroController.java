package com.example.bootcamp.controller;

import com.example.bootcamp.model.Hero;
import com.example.bootcamp.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Validated
public class HeroController {
    @Autowired
    HeroService heroServ;

    @GetMapping("/getHeroes")
    public List<Hero> getHeroes() {
        return heroServ.findAll();
    }
}


