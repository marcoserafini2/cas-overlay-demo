package com.example.config;

import com.example.other.CasTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CasConfig2 {

    @Autowired
    private CasTest casTest;
}
