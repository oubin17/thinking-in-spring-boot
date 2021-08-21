package com.ob.thinkinginspringboot.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.AbstractEnvironment;

/**
 * CalculatingServiceBootstrap
 *
 * @author oubin.ob
 * @version : CalculatingServiceBootstrap.java v 0.1 2021/8/21 23:25 oubin.ob Exp $$
 */
@Configuration
@ComponentScan(basePackageClasses = CalculatingService.class)
public class CalculatingServiceBootstrap {

    static {
        //等价于 ConfigurableEnvironment.setActiveProfiles("Java8")
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Java8");

        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "Java7");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CalculatingServiceBootstrap.class);
        context.refresh();
        CalculatingService calculatingService = context.getBean(CalculatingService.class);
        calculatingService.sum(1, 2, 3, 4, 5);
        context.close();
    }
}
