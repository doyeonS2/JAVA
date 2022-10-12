package 자바종합실습3번Client;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ImageClientTh extends Thread {
    Socket socket;
    String path;
    public ImageClientTh(Socket socket, String path) {
        this.socket = socket;
        this.path = path;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream(path);
            int len; // 수신 받은 바이트 길이
            byte[] buffer = new byte[1024]; // 한번에 수신 받는 버퍼의 크기
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("이미지 전송 완료!!");
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
