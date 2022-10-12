package 입출력연습3;
import java.io.IOException;

public class InOutEx3 {
    public static void main(String[] args) throws IOException {
        while(true) {
            int keyCode = System.in.read();
            System.out.println("Code : " + keyCode);
            if(keyCode == 'q') break; // break : 탈출(빠져나감)
        }
    }
}
