package com.samsung.myspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.samsung.myspring.sample"})
public class RootConfig {
}
