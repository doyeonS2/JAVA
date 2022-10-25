package 서버소켓통신1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 서버 소켓 통신 : 클라이언트가 연결 요청(connect())하고 서버가 연결 수락((accept))했다면,
// Socket 객체로부터 각각의 입력 스트림, 출력 스트림을 얻을 수 있습니다.
// 입력 스트림 : InputStream is = socket.getInputStream();
// 출력 스트림 : OutputStream os = socket.getOutStream();
public class ServerSocketCom1 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null; // ServerSocket에 대한 참조 변수 생성
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("192.168.10.219", 5600));
            while (true) {
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락]" + isa.getHostName());

                byte[] bytes = null;
                String message = null;

                OutputStream os = socket.getOutputStream();
                message = "안녕하세요. ^^";
                bytes = message.getBytes("UTF-8");
                os.write(bytes);
                os.flush();
                System.out.println("[데이터 보내기 성공]");

                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes,0, readByteCount, "UTF-8");
                System.out.println("[데이터 받기 성공]" + message);

                os.close();
                is.close();
            }
        } catch (BindException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
