package thinkinginspringboot.formatterspringbootstarter.autoconfiguration.formatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FormatterAutoConfiguration
 *
 * @author oubin.ob
 * @version : FormatterAutoConfiguration.java v 0.1 2021/9/4 17:59 oubin.ob Exp $$
 */
@Configuration
public class FormatterAutoConfiguration {

    /**
     * 构建 {@link DefaultFormatter} Bean
     *
     * @return {@link DefaultFormatter}
     */
    @Bean
    public Formatter defaultFormatter() {
        return new DefaultFormatter();
    }

}
