package cn.miven.spring.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingzhi.xie
 * @date 2019/1/22.
 */
@Service
public class HomeService {

    @Autowired
    private RestTemplate restTemplate;

    public String homeService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=" + name, String.class);
    }
}