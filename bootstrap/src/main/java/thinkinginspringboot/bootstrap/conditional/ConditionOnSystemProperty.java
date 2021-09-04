package thinkinginspringboot.bootstrap.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * ConditionOnSystemProperty
 *
 * @author oubin.ob
 * @version : ConditionOnSystemProperty.java v 0.1 2021/8/21 21:59 oubin.ob Exp $$
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionOnSystemProperty {

    /**
     *
     * @return System 属性名称
     */
    String name();

    /**
     *
     * @return System 属性值
     */
    String value();
}
