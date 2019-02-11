package cn.miven.spring.cloud.sleuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/one")
    public String callHome(){
        logger.log(Level.INFO, "calling trace server-one  ");
        return restTemplate.getForObject("http://localhost:8662/two", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        logger.log(Level.INFO, "calling trace server-one  ");
        return "I'm server-one";
    }
}