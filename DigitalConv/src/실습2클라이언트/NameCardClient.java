package 실습2클라이언트;
import 실습2혼자해보기.NameCardInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("[서버 접속 성공!!^_^]");
            Thread thread = new NameClientTh(socket);
            thread.start();
        } catch (Exception e) {
            System.out.println("[서버 접속 실패..ㅠ_ㅠ]");
        }
    }
    static void viewNameCard(List<NameCardInfo> nameCard) {
        int cnt = 1;
        for(NameCardInfo e : nameCard) {
            System.out.printf("===== %2d번째 명함 정보 =====\n", cnt++);
            System.out.println("이름: " + e.getName());
            System.out.println("연락처: " + e.getPhone());
            System.out.println("회사: " + e.getCompany());
            System.out.println("이메일: " + e.getEmail());

        }

    }
}
class NameClientTh extends Thread {
    Socket socket;

    public NameClientTh(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream input;
        List<NameCardInfo> nameCards;
        try {
            while (true) {
                input = socket.getInputStream(); // 소켓으로부터 input 받아옴
                ObjectInputStream ois = new ObjectInputStream(input);
                nameCards = (List<NameCardInfo>) ois.readObject();
                System.out.println("[명함 정보 받는 중..]");
                List<NameCardInfo> nameCard = null;
                NameCardClient.viewNameCard(nameCard);
                System.out.println("명함 정보를 받았습니다.");
            }
        } catch (ClassNotFoundException | IOException e) {

        }
    }
}

