package com.htisec.nacos.dubbo.consumer.controller;

import com.htisec.nacos.dubbo.provider.api.EchoService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping("/echo/{name}")
    public String echoHello(@PathVariable(name = "name") String name){
        return echoService.echoHello(name) + " greeting from "+ username;
    }
}
