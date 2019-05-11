package com.xxw.ribbon.controller;

import com.xxw.ribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiongxianwei
 * @date 2019/2/27
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    /**
     * Ribbon方式实现服务间调用
     * @param productName
     * @return
     */
    @RequestMapping("/productOrder")
    public String productOrder(@RequestParam String productName){
        return productService.productService(productName);
    }


}
