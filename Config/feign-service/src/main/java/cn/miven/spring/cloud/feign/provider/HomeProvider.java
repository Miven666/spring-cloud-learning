package cn.miven.spring.cloud.feign.provider;

import cn.miven.spring.cloud.feign.provider.hystrix.HomeHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
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
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    String home(@RequestParam(value = "name", defaultValue = "Eureka") String name);
}
