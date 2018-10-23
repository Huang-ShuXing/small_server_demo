package com.person.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public List<String> savePerson(@RequestBody String personName){
        List<String> list = new ArrayList<>();
        list.add(personName+"person");
        return list;
    }
}
