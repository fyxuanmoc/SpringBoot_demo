package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by fengy on 2017/8/7.
 */
public interface ThingRepository extends MongoRepository<Thing, String> {
    List<Thing> findAll();
}
