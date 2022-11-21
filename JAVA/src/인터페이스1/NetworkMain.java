package 인터페이스1;

import java.util.Scanner;

// 인터페이스는 추상 클래스와 마찬가지로 객체 생성이 안됨
// 인터페이스에 포함된 추상 메소드를 실제 구현할 클래스가 필요
public class NetworkMain {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택[1]LAN, [2]WIFI, [3]5G : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                adapter = new LAN("KT Megapass");
                adapter.connect();
                break;
            case 2 :
                adapter = new WiFi("SK Telecom");
                adapter.connect();
                break;
            case 3 :
                adapter = new FiveG("LG U+");
                adapter.connect();
                break;
            default:
                System.out.println("네트워크 선택이 잘못 되었습니다.");
        }

    }
}
