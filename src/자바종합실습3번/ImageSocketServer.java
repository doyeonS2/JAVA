package 자바종합실습3번;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 파일 전송을 위한 서버
public class ImageSocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 8999;
        Scanner sc = new Scanner(System.in);
        System.out.print("전송할 파일을 선택 (경로/파일명) : ");
        String path = sc.nextLine(); // 전송할 파일에 대한 경로와 파일명
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept(); // 클라이언트 연결 요청을 수락
                System.out.println("[Client : " + socket.getRemoteSocketAddress() + "연결!");
                Thread server = new ImageServerTh(socket, path);
                server.start();
            }
        } catch (ConnectException e) {
            System.out.println(e);
        } catch (IOException e) {}
    }
}
