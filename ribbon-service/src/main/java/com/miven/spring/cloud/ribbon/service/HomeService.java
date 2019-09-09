package com.miven.spring.cloud.ribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author mingzhi.xie
 * @date 2019/1/22.
 */
@Service
public class HomeService {

    @Resource
    private RestTemplate restTemplate;

    public String homeService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=" + name, String.class);
    }
}