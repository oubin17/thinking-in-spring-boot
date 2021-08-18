package com.ob.thinkinginspringboot.enable.inter;

/**
 * Server
 *
 * @author oubin.ob
 * @version : Server.java v 0.1 2021/8/18 23:33 oubin.ob Exp $$
 */
public interface Server {

    void start();

    void stop();

    enum Type {
        HTTP,
        FTP
    }
}
