package com.xxw.service_ribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiongxianwei
 * @date 2019/2/28
 */

@FeignClient(value = "orderService")
public interface ProductFeignClient {
    @GetMapping(value = "order")
    String order(String productName);
}
