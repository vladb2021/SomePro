package chatapp;
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8080);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.writeBytes("Hello to you\n");
        System.out.println(in.readLine());
        in.close();
        out.close();
        socket.close();
    }
}