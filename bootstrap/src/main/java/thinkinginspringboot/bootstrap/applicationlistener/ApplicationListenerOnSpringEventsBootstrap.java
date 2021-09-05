package thinkinginspringboot.bootstrap.applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.GenericApplicationContext;

/**
 * ApplicationListenerOnSpringEventsBootstrap
 *
 * @author oubin.ob
 * @version : ApplicationListenerOnSpringEventsBootstrap.java v 0.1 2021/9/5 16:05 oubin.ob Exp $$
 */
public class ApplicationListenerOnSpringEventsBootstrap {

    public static void main(String[] args) {
       customApplicationEventListener(args);

    }

    public static void customApplicationEventListener(String[] args) {
        //创建实例 ConfigurableApplicationContext
        GenericApplicationContext context  = new GenericApplicationContext();
        System.out.println("创建Spring应用上下文 : " + context.getDisplayName());
        context.registerBean(MyApplicationListener.class);// registerBean
        context.refresh();
        context.publishEvent(new MyApplicationEvent("Hello World"));

        context.close();
        context.publishEvent(new MyApplicationEvent("Hello World Again"));

    }

    public static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source) {
            super(source);
        }

    }

    public static class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

        @Override
        public void onApplicationEvent(MyApplicationEvent event) {
            System.out.println("监听事件类 : " + event.getClass().getSimpleName());
        }
    }


    public static void genericApplicationContext(String[] args) {
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
