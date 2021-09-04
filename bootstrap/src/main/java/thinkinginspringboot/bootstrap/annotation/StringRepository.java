package thinkinginspringboot.bootstrap.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * StringRepository
 *
 * @author oubin.ob
 * @version : StringRepository.java v 0.1 2021/8/10 23:19 oubin.ob Exp $$
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface StringRepository {

    String value() default "";
}
