package 실습2혼자해보기;
// TCP/IP 소켓을 이용한 명함 전송하기(직렬화)
// 이름, 전화번호, 회사명, 이메일 포함된 11개의 명함 정보 생성 후 다른 컴퓨터로 전송하기
// 첫번째 단계는 서버에서 연결된 1개의 클라이언트에게 11명의 명함 정보를 전송하고, 해당 클라이언트에서 수신 후 결과를 출력함
// 두번째 단계는 연결된 클라이언트의 개수에 상관 없이 모든 클라이언트에게 전송하기
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
public class NameCardServer {
    static List<NameCardInfo> list = new ArrayList<>();
    public static void main(String[] args) {
        int port = 8888;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("서버가 연결되었습니다.");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("[클라이언트 " + socket.getLocalAddress() + " : " + socket.getLocalPort() + "입장]");
                Thread server = new NameServerTh(socket);
                server.start();
            }
        } catch(ConnectException e){
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    static void writeNameCard () {
        list.add(new NameCardInfo("윤지성", "010-1991-0308", "디지Ent", "yoonj1@gmail.com"));
        list.add(new NameCardInfo("하성운", "010-1994-0322", "빅플래닛메이드", "gooreumseng@gmail.com"));
        list.add(new NameCardInfo("황민현", "010-1995-0809", "플레디스", "optimus@gmail.com"));
        list.add(new NameCardInfo("옹성우", "010-1995-0825", "판타지오", "ong@gmail.com"));
        list.add(new NameCardInfo("김재환", "010-1996-0527", "스윙", "jae527@gmail.com"));
        list.add(new NameCardInfo("강의건", "010-1996-1210", "커넥트", "daniel@gmail.com"));
        list.add(new NameCardInfo("박지훈", "010-1999-0529", "마루기획", "0529jh@gmail.com"));
        list.add(new NameCardInfo("박우진", "010-1999-1102", "브랜뉴뮤직", "pwj@gmail.com"));
        list.add(new NameCardInfo("배진영", "010-2000-0510", "C9", "baebae@gmail.com"));
        list.add(new NameCardInfo("이대휘", "010-2001-0129", "브랜뉴뮤직", "lee@gmail.com"));
        list.add(new NameCardInfo("이관린", "010-2001-0923", "무소속", "kuanlin@gmail.com"));
    }
}