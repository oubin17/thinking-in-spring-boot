package com.ob.thinkinginspringboot.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ConditionalMessageConfiguration
 *
 * @author oubin.ob
 * @version : ConditionalMessageConfiguration.java v 0.1 2021/8/21 22:11 oubin.ob Exp $$
 */
@Configuration
public class ConditionalMessageConfiguration {

    @ConditionOnSystemProperty(name = "language", value = "Chinese")
    @Bean("message")
    public String chineseMessage() {
        return "你好，世界";
    }

    @ConditionOnSystemProperty(name = "language", value = "English")
    @Bean("message")
    public String englishMessage() {
        return "Hello,World";
    }
}
