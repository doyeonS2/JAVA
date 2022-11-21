package 성능향상스트림;
import java.io.*;
// 입출력 사이에 메모리 버퍼를 사용하여 실행 성능 개선
public class ImproveStMain {
    public static void main(String[] args) throws IOException {
        long start = 0, end = 0; // 시간 측정을 위한 변수 (ms 단위)
        int data = - 1; // 읽은 데이터가 있는지 확인하는 변수
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;


        fis = new FileInputStream("C:/파일입출력tmp/bear.webp");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/성능향상스트림/copyBear.jpg");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용하지 않았을 때 : " + (end - start) + "ms");

        fis = new FileInputStream("C:/파일입출력tmp/bear.webp");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/성능향상스트림/copyBear.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        bos.close();
        System.out.println("버퍼를 사용 했을 때 : " + (end - start) + "ms");


    }
}
