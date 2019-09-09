package com.miven.spring.cloud.feign.provider.hystrix;

import com.miven.spring.cloud.feign.provider.HomeProvider;
import org.springframework.stereotype.Component;

/**
 * @author mingzhi.xie
 * @date 2019/1/23.
 */
@Component
public class HomeHystrix implements HomeProvider {
    @Override
    public String home(String name) {
        return "Sorry! " + name;
    }
}