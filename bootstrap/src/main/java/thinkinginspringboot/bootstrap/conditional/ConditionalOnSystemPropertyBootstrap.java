package thinkinginspringboot.bootstrap.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ConditionalOnSystemPropertyBootstrap
 *
 * @author oubin.ob
 * @version : ConditionalOnSystemPropertyBootstrap.java v 0.1 2021/8/21 22:14 oubin.ob Exp $$
 */
public class ConditionalOnSystemPropertyBootstrap {

    static {
        System.setProperty("language", "English");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(ConditionalMessageConfiguration.class);
        configApplicationContext.refresh();
        String message = configApplicationContext.getBean("message", String.class);
        System.out.printf("\"message\" Bean 对象 ：%s\n", message);
    }
}
