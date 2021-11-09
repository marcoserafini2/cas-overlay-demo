package com.example.config;

import com.example.other.CasTest;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.other")
@EnableConfigurationProperties(MyProperties.class)
//@Import(CasConfig2.class)
public class CasConfig {

    //@Autowired
    private CasTest casTest;
}
