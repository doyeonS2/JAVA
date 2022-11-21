package 클라이언트소켓통신1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocketCom1 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("192.168.10.223", 5600));
            System.out.println("[연결 성공]");
            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();
            message = "안녕하세요 수빈님^^";
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

        } catch (Exception e) {}

        if(!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {}
        }
    }
}
