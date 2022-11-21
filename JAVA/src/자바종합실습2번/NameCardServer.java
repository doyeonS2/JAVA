package 자바종합실습2번;
// 이름, 전화번호, 회사명, 이메일이 포함된 10개의 명함 정보 생성 후 다른 컴퓨터로 전송하기
// 접속된 클라이언트의 개수에 상관없이 모든 클라이언트에 전송하기
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NameCardServer {
    static List<NameCardS> list = new ArrayList<>(); // 객체를 저장할 어레이리스트 생성

    public static void main(String[] args) {
        // 내 아이피 : 192.168.10.219 / 강사님 아이피 : 192.168.10.245 // ipconfig
        try {
            ServerSocket serverSocket = new ServerSocket(8990);
            while (true) {
                // 클라이언트의 connect 연결 요청에 대해 대기하는 중, Blocking 모드...
                Socket socket = serverSocket.accept();
                System.out.println("[클라이언트 : ]" + socket.getRemoteSocketAddress() + "연결");
                Thread server = new ServerSocketTh(socket);
                server.start();
            }
        } catch (ConnectException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static List<NameCardS> createNameCard() {
        list.add(new NameCardS("윤지성", "010-1991-0308", "디지Ent", "yoonj1@gmail.com"));
        list.add(new NameCardS("하성운", "010-1994-0322", "빅플래닛메이드", "gooreumseng@gmail.com"));
        list.add(new NameCardS("황민현", "010-1995-0809", "플레디스", "optimus@gmail.com"));
        list.add(new NameCardS("옹성우", "010-1995-0825", "판타지오", "ong@gmail.com"));
        list.add(new NameCardS("김재환", "010-1996-0527", "스윙", "jae527@gmail.com"));
        list.add(new NameCardS("강다니엘", "010-1996-1210", "커넥트", "daniel@gmail.com"));
        list.add(new NameCardS("박지훈", "010-1999-0529", "마루기획", "0529jh@gmail.com"));
        list.add(new NameCardS("박우진", "010-1999-1102", "브랜뉴뮤직", "pwj@gmail.com"));
        list.add(new NameCardS("배진영", "010-2000-0510", "C9", "baebae@gmail.com"));
        list.add(new NameCardS("이대휘", "010-2001-0129", "브랜뉴뮤직", "lee@gmail.com"));
        list.add(new NameCardS("라이관린", "010-2001-0923", "워너원", "kuanlin@gmail.com"));
        return list;
    }
}