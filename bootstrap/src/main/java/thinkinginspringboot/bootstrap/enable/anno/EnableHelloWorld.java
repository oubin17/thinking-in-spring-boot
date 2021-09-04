package thinkinginspringboot.bootstrap.enable.anno;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * EnableHelloWorld
 *
 * @author oubin.ob
 * @version : EnableHelloWorld.java v 0.1 2021/8/16 23:35 oubin.ob Exp $$
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWorldConfiguration.class) //import HelloWorldConfiguration
public @interface EnableHelloWorld {
}
