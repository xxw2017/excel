package com.xxw.service_ribbon.controller;

import com.xxw.service_ribbon.service.ProductFeignClient;
import com.xxw.service_ribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Contended;

/**
 * @author xiongxianwei
 * @date 2019/2/27
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductFeignClient productFeignClient;
   /* @RequestMapping("/productOrder")
    public String productOrder(@RequestParam String productName){
        //return "123"+productName;
        return productService.productService(productName);
    }*/
   @RequestMapping("/productOrder")
   public String productOrder(@RequestParam String productName){
       //return "123"+productName;
       return productFeignClient.order(productName);
   }
}
