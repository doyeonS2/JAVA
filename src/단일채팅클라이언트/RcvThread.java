package 단일채팅클라이언트;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public class RcvThread extends Thread{
    private final Socket socket;
    private String rcvString;

    public RcvThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream buf = new DataInputStream(socket.getInputStream());
            while (true) {
                try {
                    rcvString = buf.readUTF();
                    if (rcvString == null) {
                        System.out.println("상대방 연결이 종료되었습니다.");
                    } else {
                        System.out.println("[상대방] : " + rcvString);
                    }
                } catch (EOFException e) {
                    System.out.println("상대방 연결이 종료되었습니다.");
                    socket.close();
                    break;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
