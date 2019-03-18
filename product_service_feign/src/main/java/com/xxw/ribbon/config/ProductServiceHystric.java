package com.xxw.ribbon.config;

import com.xxw.ribbon.service.ProductFeignClient;
import org.springframework.stereotype.Component;

/**
 * Feign熔断器
 * @author xiongxianwei
 * 2019/3/16 0016
 */

@Component
public class ProductServiceHystric implements ProductFeignClient {
    @Override
    public String order(String productName) {
        return "启动feign熔断器,"+productName+"商品下单失败！";
    }
}
