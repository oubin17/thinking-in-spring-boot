package thinkinginspringboot.bootstrap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @Description:
 * @CreateDate: 2022/1/4 10:12 下午
 * @Version: 1.0
 * @Author: oubin
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
