package 다중채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
    public static void main(String[] args) {
        // 서버 : 192.168.10.245
        int port = 8900;
        try {
            // port 번호만 넣으면 서버의 첫번째 ip가 자동 입력
            // 바인딩 과정 생략
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                // 하나의 session, 즉 한개의 연결 통로가 만들어짐
                Socket socket = serverSocket.accept();
                Thread serverTh = new ServerSocketTh(socket);
                serverTh.start();


            }

        } catch (IOException e) {}
    }
}
