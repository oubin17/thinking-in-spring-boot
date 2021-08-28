package com.ob.thinkinginspringboot.enable.inter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * EnableSererBootstrap
 *
 * @author oubin.ob
 * @version : EnableServrBootstrap.java v 0.1 2021/8/18 23:46 oubin.ob Exp $$
 */
@Configuration
@EnableServer(type = Server.Type.FTP)
public class EnableServerBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(EnableServerBootstrap.class);
        configApplicationContext.refresh();
        Server server = configApplicationContext.getBean(Server.class);
        server.start();
        server.stop();

    }
}
