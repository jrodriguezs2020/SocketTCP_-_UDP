/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettcp;

import java.io.FileOutputStream;
import java.net.Socket;

/**
 *
 * @author javii
 */
public class SocketTCP {


    public static void main(String argv[]) throws Exception
    {
        //Configuramos los flujos convenientemente
        String IP = "";
        int port = 0;
        
        Socket socket = new Socket(IP, port);
        FileOutputStream fileStream = new FileOutputStream("");
        
        String sentence = "";
        socket.getOutputStream().write(sentence.getBytes());
        
        int b = socket.getInputStream().read();
        while (b != -1) {
            fileStream.write(b);
            b = socket.getInputStream().read();
        }
        fileStream.close();
        socket.close();
    }
}
