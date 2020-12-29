package Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ashfaqahmed
 */
import java.io.*;

//import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server has started... Waiting for connections");

            Socket s = ss.accept();//establishes connection   

            DataInputStream stream = new DataInputStream(s.getInputStream());
            String str = (String) stream.readUTF();
            System.out.println("From Client = " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
