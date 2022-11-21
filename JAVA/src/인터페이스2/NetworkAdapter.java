package 인터페이스2;

public interface NetworkAdapter {

    void connect(); // 추상 메소드
}

class Chat {
    public void sendMsg() {
        System.out.println("메시지를 보냅니다.");
    }

    public void rcvMsg() {
        System.out.println("메시지를 받습니다.");
    }
}
class  LAN extends Chat implements 인터페이스1.NetworkAdapter {
    String company;
    String name;
    LAN(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + "LAN에 연결되었습니다.");
    }
//    @Override
//    public void sendMsg() {
//        System.out.println(name + "에게 메시지를 보냅니다.");
//    }
//    @Override
//    public void rcvMsg() {
//        System.out.println(name + "로부터 메시지를 받습니다.");
//    }
}
class WiFi implements 인터페이스1.NetworkAdapter {
    String company;
    String name;
    WiFi(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결되었습니다.");
    }
    public void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    public void rcvMsg() {
        System.out.println(name + "으로 부터 메시지를 받습니다.");
    }
}
class FiveG implements 인터페이스1.NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;

    }

    @Override
    public void connect() {

    }
}

