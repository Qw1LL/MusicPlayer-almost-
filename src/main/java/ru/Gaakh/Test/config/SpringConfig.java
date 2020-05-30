package ru.Gaakh.Test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.Gaakh.Test")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
