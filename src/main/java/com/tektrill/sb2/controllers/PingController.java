package com.tektrill.sb2.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PingController.class);
    @GetMapping("/ping")
    public String greet(){
        LOGGER.info("Received Ping Request "+new Date());
        return "Hello from PingController.....";
    }
}
