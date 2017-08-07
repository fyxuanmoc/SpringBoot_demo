package com.example.demo;
import org.springframework.data.annotation.Id;
/**
 * Created by fengy on 2017/8/7.
 */
public class Thing {
    @Id
    public int id;
    public String thing;
    public int status;
    public Thing(){}
    public Thing(String thing,int status){
        this.thing=thing;
        this.status=status;
    }
}
