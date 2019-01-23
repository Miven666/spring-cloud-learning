package cn.miven.spring.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author mingzhi.xie
 * @date 2019/1/22.
 */
@RestController
public class HomeController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "Eureka") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}