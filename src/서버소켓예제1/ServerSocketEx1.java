package 서버소켓예제1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx1 {
    public static void main(String[] args) {
        // ServerSocket 생성하는 첫번째 방법 : 생성자에 포트 번호 대입
        // ServerSocket serverSocket = new ServerSocket(5001);

        // 두번째 방법
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            // 만들어진 Server Socket에 IP와 포트번호를 연결해줌
            // BindException error가 발생하는 경우, 해당 포트가 이미 사용중이면 에러 발생
            serverSocket.bind(new InetSocketAddress("192.168.10.219", 5500));
            while (true) { // 클라이언트 연결을 기다림...
                System.out.println("[클라이언트 연결을 기다림...]");
                // 클라이언트 연결 요청하기까지 Blocking (잠겨있는 상태), 반환값은 열린 소켓에 대한 식별자
                Socket socket = serverSocket.accept(); // 클라이언트 연결을 받기
                // 연결된 클라이언트의 IP, port번호 확인
                // getHostName() : 클라이언트 IP Address
                // getPort() : 클라이언트의 포트 번호
                // toString() : "IP:포트번호" 형태로 문자열 리턴
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함]" + isa.getHostName());

            }
        } catch (Exception e) {}
        if (!serverSocket.isClosed()); {
            try {
                serverSocket.close();
            } catch (IOException e) {}
        }
    }
}
