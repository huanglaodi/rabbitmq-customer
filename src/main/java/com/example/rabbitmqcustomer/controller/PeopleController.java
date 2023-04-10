package com.example.rabbitmqcustomer.controller;

import com.example.rabbitmqcustomer.model.People;
import com.example.rabbitmqcustomer.service.PeopleMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    PeopleMapperService peopleMapperService;


    @GetMapping
    @RequestMapping("/selectByName")
    public People selectByName(@RequestParam("name") String name){
        return peopleMapperService.selectByName(name);
    }



}
