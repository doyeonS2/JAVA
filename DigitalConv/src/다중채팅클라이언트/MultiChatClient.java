package 다중채팅클라이언트;

import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.10.245", 8900);
            System.out.println("서버 접속 성공");
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 설정하세요 : ");
            Thread sndTh = new MultiSnd(socket, sc.nextLine());
            Thread rcvTh = new MultiRcv(socket);
            sndTh.start();
            rcvTh.start();

        } catch (Exception e) {
            System.out.println("서버 접속 실패!!");
        }
    }
}
