package com.springtest.javaconf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(AppConfig.class)
@PropertySource("classpath:placeholders.properties")
public class StandaloneConfig {

}
