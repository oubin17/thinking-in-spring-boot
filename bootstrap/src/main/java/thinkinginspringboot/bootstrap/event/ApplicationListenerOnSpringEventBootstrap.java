package thinkinginspringboot.bootstrap.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * ApplicationListenerOnSpringEventBootstrap
 *
 * @Description:
 * @CreateDate: 2022/2/19 11:28 上午
 * @Version: 1.0
 * @Author: oubin
 */
public class ApplicationListenerOnSpringEventBootstrap {

    public static void main(String[] args) {
        //创建实例 ConfigurableApplicationContext
        GenericApplicationContext context  = new GenericApplicationContext();
        System.out.println("创建Spring应用上下文 : " + context.getDisplayName());
        //添加ApplicationListener非泛型实现
        context.addApplicationListener(event -> System.out.println("触发事件 : " + event.getClass().getSimpleName()));

        //refresh():初始化应用上下文
        System.out.println("应用上下文准备初始化...");
        context.refresh();//发布ContextRefreshedEvent
        System.out.println("应用上下文已初始化...");

        //stop():停止应用上下文
        System.out.println("应用上下文准备停止启动...");
        context.stop();//发布ContextStoppedEvent
        System.out.println("应用上下文已停止启动...");

        //start():启动应用上下文
        System.out.println("应用上下文准备启动启动...");
        context.start();//发布ContextStartedEvent
        System.out.println("应用上下文已启动启动...");

        //close():关闭应用上下文
        System.out.println("应用上下文准备关闭...");
        context.close();//发布ContextClosedEvent
        System.out.println("应用上下文已关闭...");

    }
}
