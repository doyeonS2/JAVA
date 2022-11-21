package 다중채팅클라이언트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiRcv extends Thread {
    Socket socket;
    public MultiRcv(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        InputStream input; // 바이너리 입력
        InputStreamReader isr; // 바이너리를 문자로 변환하는 스트림
        BufferedReader reader; // 성능 향상 보조 스트림
        String str;
        try {
            while (true) {
                input = socket.getInputStream(); // 소켓으로부터 바이너리 입력
                isr = new InputStreamReader(input);
                reader = new BufferedReader(isr);
                if ((str = reader.readLine()) != null) {
                    System.out.println(str);
                }
            }

        } catch (IOException e) {}
    }
}
