package 실습2혼자해보기;

import java.net.Socket;
import java.util.ArrayList;

public class NameServerTh extends Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;

    public NameServerTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
}
