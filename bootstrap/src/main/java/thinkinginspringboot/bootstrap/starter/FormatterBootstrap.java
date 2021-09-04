package thinkinginspringboot.bootstrap.starter;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import thinkinginspringboot.formatterspringbootstarter.autoconfiguration.formatter.Formatter;

import java.util.HashMap;
import java.util.Map;

/**
 * FormatterBootstrap
 *
 * @author oubin.ob
 * @version : FormatterBootstrap.java v 0.1 2021/9/4 18:14 oubin.ob Exp $$
 */
@EnableAutoConfiguration
public class FormatterBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(FormatterBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        Map<String, Object> data = new HashMap<>();
        data.put("name", "oubin17");
        Formatter formatter = context.getBean(Formatter.class);
        System.out.printf("formatter.format() : %s\n", formatter.format(data));
        context.close();
    }
}
