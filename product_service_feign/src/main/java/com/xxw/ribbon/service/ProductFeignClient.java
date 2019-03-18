package com.xxw.ribbon.service;

import com.xxw.ribbon.config.ProductServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiongxianwei
 * @date 2019/2/28
 */

//配置服务名与熔断器
@FeignClient(value = "orderService",fallback = ProductServiceHystric.class)
public interface ProductFeignClient {

    //所配置的服务中的接口名与方法名
    @GetMapping(value = "order")
    String order(@RequestParam(value = "productName")String productName);

}
