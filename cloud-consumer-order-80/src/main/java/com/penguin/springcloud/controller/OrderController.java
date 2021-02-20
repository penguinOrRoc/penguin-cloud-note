package com.penguin.springcloud.controller;

import com.penguin.springcloud.entities.CommonResult;
import com.penguin.springcloud.entities.Payment;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
    //指定远程服务地址，
    public static final String PAYMENT_URL = "http://localhost:8080";

    @Resource
    private RestTemplate restTemplate;//使用前，需将RestTemplate加载到IOC容器（注解、配置文件两种方式）

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {

        return restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}


