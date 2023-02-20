/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author javii
 */
public class SocketUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        
        String IP = "";
        int port = 0;
        
        //Creamos datagrama de salida con el mensaje
        InetAddress dirIP = InetAddress.getByName(IP);
        String sentence = "";
        byte[] outBuff = sentence.getBytes();
        DatagramPacket outPac = new DatagramPacket(outBuff, outBuff.length, dirIP, port);
        //Creamos el socket y enviamos el datagrama
        DatagramSocket socket = new DatagramSocket();
        socket.send(outPac);

        //Recibimos un datagrama
        byte[] inputBuff = new byte[1024];
        DatagramPacket inPac = new DatagramPacket(inputBuff, inputBuff.length);
        socket.receive(inPac);
        socket.close();

        String newSentence = new String(inPac.getData());
        System.out.println("DEL SERVIDOR:" + newSentence);
    }
}
