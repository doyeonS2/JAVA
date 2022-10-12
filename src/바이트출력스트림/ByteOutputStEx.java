package 바이트출력스트림;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// 바이트 단위로 데이터를 전송, 주로 파일(동영상, 이미지 등등) 전송에 사용
// 최상위 추상 클래스는 OutputStream
// FileOutputStream은 OutputStream 추상클래스의 자손이며 파일 출력
public class ByteOutputStEx {
    public static void main(String[] args) throws IOException {
        //OutputStream os = new FileOutputStream("src/바이트출력스트림/test0816.txt"); // 상대 경로
//        OutputStream os = new FileOutputStream("C:/파일입출력tmp/test0816_01.txt"); // 절대 경로
//        byte a = 10; // 자바의 기본 타입 중 제일 작은 기본 타입
//        byte b = 20;
//        byte c = 30;
//        os.write(a); // 주어진 값을 출력(어디로? 파일에다가...)
//        os.write(b);
//        os.write(c);
//        os.flush(); // 남아 있는 버퍼에 내용을 모두 비움.
//        os.close(); // 파일에 쓰기 위해 열어 둔 스트림의 자원을 반납하고 스트림을 닫음

//        OutputStream os = new FileOutputStream("C:/파일입출력tmp/test0816_02.txt");
//        byte[] array= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        os.write(array);
//        os.flush();
//        os.close();

        OutputStream os = new FileOutputStream("C:/파일입출력tmp/test0816_03.txt");
        byte[] array= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        os.write(array, 1, 3); // 배열 1번 인덱스에서 3개의 값 출력
        os.flush();
        os.close();


    }
}
