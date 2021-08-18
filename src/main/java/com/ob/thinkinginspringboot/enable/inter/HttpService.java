package com.ob.thinkinginspringboot.enable.inter;

import org.springframework.stereotype.Component;

/**
 * HttpService
 *
 * @author oubin.ob
 * @version : HttpService.java v 0.1 2021/8/18 23:34 oubin.ob Exp $$
 */
@Component
public class HttpService implements Server {

    @Override
    public void start() {
        System.out.println("HTTP服务器启动中...");
    }

    @Override
    public void stop() {
        System.out.println("HTTP服务器关闭中...");
    }
}
