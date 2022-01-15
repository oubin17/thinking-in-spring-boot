package thinkinginspringboot.bootstrap.enable.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * EnableHelloWorldBootstrap
 *
 * @author oubin.ob
 * @version : EnableHelloWorldBootstrap.java v 0.1 2021/8/16 23:37 oubin.ob Exp $$
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        //构建 Annotation配置驱动Spring上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册当前引导类
        context.register(EnableHelloWorldBootstrap.class);

        //启动上下文
        context.refresh();

        //获取bean
        String helloWorld = context.getBean("enableHelloWorld", String.class);
        System.out.println("HelloWorld = " + helloWorld);

//        String helloWorldCompare = context.getBean("enableHelloWorldCompare", String.class);
//        System.out.println("HelloWorldCompare = " + helloWorldCompare);

        context.close();
    }
}
