package 자바종합실습2번;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
public class ServerSocketTh extends Thread {
    Socket socket; // 클라이언트 연결에 대한 소켓 식별자
    ArrayList<Socket> sockets = new ArrayList<>(); // 개별 소켓 연결을 저장
    public ServerSocketTh(Socket socket) { // 클라이언트의 개수 만큼 생성자 호출
        this.socket = socket;
        sockets.add(socket); // 각각의 클라이언트 소켓에 대한 세션(식별자)
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < sockets.size(); i++) {
                OutputStream out = sockets.get(i).getOutputStream();
                // 직렬화를 위한 스트림
                ObjectOutputStream oos = new ObjectOutputStream(out);
                // 생성된 어레이 리스트
                oos.writeObject(NameCardServer.createNameCard());
                oos.flush(); // 버퍼 비우기
                oos.close(); // 해당 스트림 종료
                System.out.println(sockets.get(i).getRemoteSocketAddress() + "에게 전송 완료");
                out.close();

            }

        } catch (IOException e) { }
    }
}
