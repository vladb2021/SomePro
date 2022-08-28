package chatapp;
import java.io.*;
import java.net.*;

public class Server {

    private String fromClient;
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader in;
    private DataOutputStream out;

    public Server (ServerSocket serverSocket) throws IOException {
        this.serverSocket = serverSocket;
        this.socket = serverSocket.accept();
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new DataOutputStream(socket.getOutputStream());
    }

    public void startServer(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()){
                    try {
                        fromClient = in.readLine();
                        out.writeBytes("I got: " + fromClient + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                        closeServerSocket();
                    }
                }
            }
        }).start();
    }

    public void closeServerSocket(){
        try{
            if(serverSocket != null)
                serverSocket.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Server server = new Server(serverSocket);
        server.startServer();
        server.closeServerSocket();
    }
}