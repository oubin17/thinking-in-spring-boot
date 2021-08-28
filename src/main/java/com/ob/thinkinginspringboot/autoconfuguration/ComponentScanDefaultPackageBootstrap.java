package com.ob.thinkinginspringboot.autoconfuguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.stream.Stream;

/**
 * ComponentScanDefaultPackageBootstrap
 *
 * @author oubin.ob
 * @version : ComponentScanDefaultPackageBootstrap.java v 0.1 2021/8/22 13:40 oubin.ob Exp $$
 */
@ComponentScan(basePackages = "com.ob.thinkinginspringboot")
//@ComponentScan(basePackageClasses = ThinkingInSpringBootApplication.class)
public class ComponentScanDefaultPackageBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanDefaultPackageBootstrap.class);

        System.out.println("当前Spring应用上下文中所有注册的Bean名称： ");

        Stream.of(context.getBeanDefinitionNames())
                .map(name -> "\t" + name)
                .forEach(System.out::println);
        context.close();

    }
}
