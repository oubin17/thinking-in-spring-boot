package com.ob.thinkinginspringboot.enable.inter;

/**
 * FtpServer
 *
 * @author oubin.ob
 * @version : FtpServer.java v 0.1 2021/8/18 23:35 oubin.ob Exp $$
 */
public class FtpServer implements Server {


    @Override
    public void start() {
        System.out.println("FTP服务器启动中...");
    }

    @Override
    public void stop() {
        System.out.println("FTP服务器关闭中...");
    }
}
