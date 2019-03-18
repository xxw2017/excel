package com.xxw.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiongxianwei
 * @date 2019/2/27
 */
@Service
public class ProductService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "doError" )
    public String productService(String productName){
       // return restTemplate.getForObject("http://localhost:8762/order?productName="+productName,String.class);
        return restTemplate.getForObject("http://orderService/order?productName="+productName,String.class);
    }


    public String doError(String productName){
        return "启动ribbon熔断器,"+productName+"商品下单失败！";
    }
}
