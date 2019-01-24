package cn.miven.spring.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingzhi.xie
 * @date 2019/1/24.
 */
@RestController
public class HomeController {

    @Value("${foo}")
    String foo;

    @GetMapping(value = "/hi")
    public String home(){
        return foo;
    }
}