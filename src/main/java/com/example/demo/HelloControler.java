package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fengy on 2017/8/6.
 */
@RestController
public class HelloControler {
    @Autowired
    ThingRepository tr;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "hello springBoot";
    }
    @RequestMapping(value = "/test")
    public String test(){
        Thing thing=new Thing("123",1);
        thing.id=1;
        tr.save(thing);
        return "ok";
    }
    @RequestMapping(value = "/find")
    public List<Thing> find(){
        return tr.findAll();
    }
}
