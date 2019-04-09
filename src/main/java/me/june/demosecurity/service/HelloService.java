package me.june.demosecurity.service;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-09
 * Time: 21:04
 **/
@Service
public class HelloService {

    public String sayHello() {
        return "Hello Root";
    }
}
