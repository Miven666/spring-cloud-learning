package com.miven.spring.cloud.sleuth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author mingzhi.xie
 * @date 2019/2/11.
 */
@RestController
public class HomeController {

    private static final Logger logger = Logger.getLogger(HomeController.class.getName());

    private final RestTemplate restTemplate;

    public HomeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @RequestMapping("/two")
    public String info(){
        logger.log(Level.INFO, "calling trace server-two  ");
        return restTemplate.getForObject("http://localhost:8661/info", String.class);
    }

}