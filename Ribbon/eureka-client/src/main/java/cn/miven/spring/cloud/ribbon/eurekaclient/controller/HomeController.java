package cn.miven.spring.cloud.ribbon.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingzhi.xie
 * @date 2019/1/22.
 */
@RestController
public class HomeController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "Eureka") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}