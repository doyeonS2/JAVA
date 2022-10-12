package 자바종합실습2번Client;
import 자바종합실습2번.NameCardS;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameClientTh extends Thread {
    Socket socket;
    public NameClientTh(Socket socket) {
        this.socket = socket;
    }
    void viewNameCard(List<NameCardS> nameCardS) {
        for(NameCardS e : nameCardS) {
            System.out.println("====== 명함 정보 출력 ======");
            System.out.println("이름 : " + e.getName());
            System.out.println("회사 : " + e.getCompany());
            System.out.println("전화번호 : " + e.getPhone());
            System.out.println("이메일 : " + e.getEmail());
        }
    }
    @Override
    public void run() {
        InputStream is = null;
        ObjectInputStream ois; // 역직렬화
        List<NameCardS> nameCardS;
        try {
            while (true) {
                is = socket.getInputStream();
                ois = new ObjectInputStream(is);
                nameCardS = (List<NameCardS>) ois.readObject();
            }

        } catch (EOFException e) {
            System.out.println("<< 명함 수신이 완료 되었습니다. 작업을 종료합니다.>>");
            if(is != null) {
                try {
                    is.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        } catch (IOException e) {
            System.out.println(e);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
