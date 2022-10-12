package 다중채팅클라이언트;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiSnd extends Thread {
    Socket socket;
    String name;
    Scanner sc;

    public MultiSnd(Socket socket, String name) {
        sc = new Scanner(System.in);
        this.socket = socket;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            while (true) {
                // 궁극적으로는 소켓에 써야함
                OutputStream out = socket.getOutputStream();
                // true를 넣으면 자동 flush 되므로 별로도 flush 호출 안해도 됨
                PrintWriter writer = new PrintWriter(out, true);
                // 출력을 콘솔 출력과 동일하게 사용 가능
                writer.println(name + " : " + sc.nextLine());
            }
        } catch (IOException e) {}
    }
}
