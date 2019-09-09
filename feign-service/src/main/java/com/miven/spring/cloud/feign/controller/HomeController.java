package com.miven.spring.cloud.feign.controller;

import com.miven.spring.cloud.feign.provider.HomeProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mingzhi.xie
 * @date 2019/1/23.
 */
@RestController
public class HomeController {
    @Resource
    private HomeProvider homeProvider;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "Feign-service") String name) {
        return homeProvider.home(name);
    }
}