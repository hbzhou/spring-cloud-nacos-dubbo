package com.htisec.nacos.dubbo.provider.service.impl;

import com.htisec.nacos.dubbo.provider.api.EchoService;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private int port;

    @Override
    public String echoHello(String name) {
        return "Hello, " + name+ " from port: "+ port;
    }
}
