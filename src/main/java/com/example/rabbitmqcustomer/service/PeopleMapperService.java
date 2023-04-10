package com.example.rabbitmqcustomer.service;

import com.example.rabbitmqcustomer.mapper.PeopleMapper;
import com.example.rabbitmqcustomer.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleMapperService {

    @Autowired
    PeopleMapper peopleMapper;

    public People selectByName(String name){

        return peopleMapper.selectByName(name);
    }

}
