package com.ob.thinkinginspringboot.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Objects;

/**
 * OnSystemPropertyCondition
 *
 * @author oubin.ob
 * @version : OnSystemPropertyCondition.java v 0.1 2021/8/21 22:00 oubin.ob Exp $$
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //获取 ConditionOnSystemProperty 所有的属性方法值
        MultiValueMap<String, Object> attributes = metadata.getAllAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String propertyName = (String) attributes.getFirst("name");
        String propertyValue = (String) attributes.getFirst("value");
        String systemPropertyValue = System.getProperty(propertyName);
        if (Objects.equals(systemPropertyValue, propertyValue)) {
            System.out.printf("系统属性[名称 : %s ] 找到匹配值: %s\n", propertyName, propertyValue);
            return true;
        }
        return false;
    }
}
