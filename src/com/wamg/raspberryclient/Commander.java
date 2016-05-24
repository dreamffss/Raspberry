package com.wamg.raspberryclient;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: zhixiong
 * Date: 3/16/13
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Commander {
    public static String HOST ="192.168.1.123";
    public static int PORT =8888;
    public static void send(Command forward) throws Exception {
            Socket socket = new Socket(HOST, PORT);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(forward.toString());
            writer.flush();
            socket.close();
    }
}

