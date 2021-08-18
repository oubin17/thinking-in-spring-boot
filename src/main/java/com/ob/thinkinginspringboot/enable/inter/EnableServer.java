package com.ob.thinkinginspringboot.enable.inter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * EnableServer
 *
 * @author oubin.ob
 * @version : EnableServer.java v 0.1 2021/8/18 23:36 oubin.ob Exp $$
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ServerImportSelector.class)
public @interface EnableServer {

    /**
     * 设置服务器类型
     *
     * @return
     */
    Server.Type type();
}
