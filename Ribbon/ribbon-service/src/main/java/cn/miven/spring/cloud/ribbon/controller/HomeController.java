package cn.miven.spring.cloud.ribbon.controller;

import cn.miven.spring.cloud.ribbon.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingzhi.xie
 * @date 2019/1/22.
 */
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/hi")
    public String home(@RequestParam(required = false) String name) {
        return homeService.homeService(name);
    }
}