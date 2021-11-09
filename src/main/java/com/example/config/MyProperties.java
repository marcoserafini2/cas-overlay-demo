package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "myprop")
public class MyProperties {

    @Value("${mykey.k1}")
    private String v;
}
