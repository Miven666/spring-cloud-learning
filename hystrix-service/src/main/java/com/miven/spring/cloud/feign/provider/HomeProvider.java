package com.miven.spring.cloud.feign.provider;

import com.miven.spring.cloud.feign.provider.hystrix.HomeHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mingzhi.xie
 * @date 2019/1/23.
 */
@FeignClient(value = "eureka-client", fallback = HomeHystrix.class)
public interface HomeProvider {

    /**
     * 测试提供者
     * @param name name
     * @return String
     */
    @GetMapping(value = "/hi")
    String home(@RequestParam(value = "name", defaultValue = "Eureka") String name);
}
