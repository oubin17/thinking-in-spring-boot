package thinkinginspringboot.bootstrap.enable.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * EnableHelloWorldCompare
 *
 * @Description:
 * @CreateDate: 2022/1/15 3:00 下午
 * @Version: 1.0
 * @Author: oubin
 */
//@Configuration
public class EnableHelloWorldCompare {

    @Bean
    public String enableHelloWorldCompare() {
        return "Hello,World Compare";
    }
}
