package 단일채팅클라이언트;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class SndThread extends Thread {
    private final Socket socket;
    private final String name;
    Scanner sc = new Scanner(System.in);
    public SndThread(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            DataOutputStream sndWriter = new DataOutputStream(socket.getOutputStream());
            String sndString;
            while (true) {
                System.out.print("> ");
                sndString = name + " : " + sc.nextLine();
                // UTF-8 인코딩을 사용해서 문자열 출력, socket에 출력
                try {
                    sndWriter.writeUTF(sndString);
                    sndWriter.flush();
                } catch (SocketException e) {
                    System.out.println("소켓 연결이 종료되었습니다.");
                    if(socket != null) {
                        socket.close();
                    }
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
