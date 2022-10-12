//package 자바3차시험대비;
//// 문제 해결 시나리오
//1. 클라이언트용 프로그램 작성했으나 서버에 연결되지 않음. 이유를 찾아서 기술
//import java.io.IOException;
//import java.net.InetAddress;
//import java.net.Socket;
//
//public class ClientMain {
//    public static void main(String[] args) {
//        // 클라이언트에서 서버 연결시 접속 실패에 대한 원인 (서버 IP : 192.168.20.34 포트번호 : 3000)
//        // 클라이언트에서 서버 접속시에는 서버의 IP와 포트 번호를 정확히 기입해야 한다.
//        int port = 3000;
//        // String serverIP = "192.168.20.34";
//        String serverIP;
//        try {
//            // Socket socket = new Socket("서버에 대한 IP", "서버에서 지정한 port 번호");
//            serverIP = InetAddress.getLocalHost().getHostAddress(); // 자기 자신의 IP Address 이기 때문에 잘못됨
//            Socket socket = new Socket(serverIP, port);
//            System.out.println(serverIP); // 자기 자신의 IP Address를 가져옴..
//
//        } catch (IOException e) {}
//    }
//}
//
// // 서버 아이피를 넣어야됨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//// 자신의 IP를 가져오기 때문에 서버 IP가 아님!!!!!!!!!!!!!!!!