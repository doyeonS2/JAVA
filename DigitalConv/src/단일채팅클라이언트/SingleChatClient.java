package 단일채팅클라이언트;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
// 클라이언트 APP 실행 시 이름을 입력 받아서 사용
// 서버와 통신 시 이름이 채팅 문구 앞에 보이도록 수정
// 연결 끊기 기능 추가 : quit 입력시 연결 끊기도록 추가
public class SingleChatClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용할 닉네임을 입력하세요 : ");
        String nicName = sc.next();
        Socket sock = null;
        try {
            sock = new Socket("192.168.10.219", 8888);
            System.out.println("서버와 연결되었습니다.");
        } catch (ConnectException e) {
            System.out.println("서버와의 연결이 거절되었습니다. 서버를 먼저 실행하세요.");
        } catch (UnknownHostException e) {
            System.out.println("서버를 알 수 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(sock != null) {
            RcvThread rcvThread = new RcvThread(sock);
            rcvThread.start();
            SndThread sndThread = new SndThread(sock, nicName);
            sndThread.start();
        }
    }
}
