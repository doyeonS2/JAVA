package 단일채팅서버;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

// 수신용 쓰레드 생성
public class ReceiveThread extends Thread{
    private final Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream buf = new DataInputStream(socket.getInputStream());
            String rcvString;
            while (true) {
                // UTF-8 인코딩해서 문자열을 입력받음
                rcvString = buf.readUTF();
                System.out.println("상대방 : " + rcvString);
                if(rcvString.contains("quit")) {
                    System.out.println("클라이언트 요청으로 연결을 끊습니다.");
                    socket.close();
                }
            }

        } catch (SocketException e1) {
            System.out.println("상대방의 연결이 종료되었습니다.");
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
