package thinkinginspringboot.formatterspringbootstarter.autoconfiguration.formatter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FormatterAutoConfiguration
 *
 * @author oubin.ob
 * @version : FormatterAutoConfiguration.java v 0.1 2021/9/4 17:59 oubin.ob Exp $$
 */
@Configuration
@ConditionalOnProperty(prefix = "formatter", name = "enabled", havingValue = "true", matchIfMissing = true)//当配置不存在时，同样视作配置
@ConditionalOnResource(resources = "META-INF/spring.factories")
//@ConditionalOnNotWebApplication 非web应用下生效
//@ConditionalOnExpression("${spring.aop.auto:true}") //少用，基本上用@ConditionalOnProperty可以替代
public class FormatterAutoConfiguration {

    /**
     * 构建 {@link DefaultFormatter} Bean
     *
     * @return {@link DefaultFormatter}
     */
    @Bean
    @ConditionalOnMissingClass(value = "com.fasterxml.jackson.databind.ObjectMapper")
    public Formatter defaultFormatter() {
        return new DefaultFormatter();
    }

    /**
     * Json格式 {@link JsonFormatter} Bean
     *
     * @return {@link JsonFormatter}
     */
    @Bean
    @ConditionalOnClass(name = "com.fasterxml.jackson.databind.ObjectMapper")
    public Formatter jsonFormatter() {
        return new JsonFormatter();
    }

}
