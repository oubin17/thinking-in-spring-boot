package com.ob.thinkinginspringboot.enable.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorldConfiguration
 *
 * @author oubin.ob
 * @version : HelloWorldConfiguration.java v 0.1 2021/8/16 23:34 oubin.ob Exp $$
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello,World";
    }
}
