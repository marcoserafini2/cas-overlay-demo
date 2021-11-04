package com.example.config;

import com.example.other.CasTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.other")
public class CasConfig {

    @Autowired
    private CasTest casTest;
}
