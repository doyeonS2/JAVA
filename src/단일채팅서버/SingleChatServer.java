package 단일채팅서버;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {
    public static void main(String[] args) throws IOException {
        int port = 8888;
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket sock = serverSocket.accept();
            System.out.println("IP : " + sock.getInetAddress() + " 와 연결되었습니다.");
            ReceiveThread receiveThread = new ReceiveThread(sock);
            receiveThread.start();
            SendThread sendThread = new SendThread(sock);
            sendThread.start();

        }


    }
}
