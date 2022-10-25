package 클라이언트소켓예제1;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
// Client는 연결 요청
public class ClientSocketEx1 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket(); // 연결을 위한 소켓 생성
            System.out.println("[연결 요청]");
            // 192.168.10.219
            socket.connect(new InetSocketAddress("192.168.10.223", 8888));
            System.out.println("[연결 성공]");
        } catch (Exception e) {
        }
        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {}
        }
    }
}