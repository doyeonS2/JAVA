package 바이트입력스트림;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// InputStream은 바이트 기반 입력 스트림의 최상위 추상 클래스입니다.
// 자식으로는 FileInputStream, BufferInputStream, DataInputStream
public class ByteInputStEx {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/파일입출력tmp/test0816_03.txt");
        // 1 Byte씩 읽는 방법
//        while (true) {
//            int data = is.read(); // 스트림으로부터 1바이트를 읽음(반환 타입이 int형임)
//            if (data == -1) break; // 더 이상을 읽을 데이터가 없다는 뜻
//            System.out.println(data);
//        }

//        // 배열의 길이 만큼 읽기
//        byte[] buffer = new byte[100];
//        while (true) {
//            int readByteNum = is.read(buffer); // 배열의 길이(100)만큼 읽음
//            if(readByteNum == -1) break; // 파일의 끝... 더 이상 읽을 데이터가 없다는 뜻
//            for(int i = 0; i < readByteNum; i++) {
//                System.out.println(buffer[i]);
//            }
//        }

        // 지정된 길이 만큼 읽기
        byte[] buffer = new byte[5];
        int readByteNum = is.read(buffer, 2, 3); // 2번 인덱스에서부터 3개의 값 읽기
        if(readByteNum != -1) {
            for(int i = 2; i < buffer.length; i++) {
                System.out.println(buffer[i]);

            }
        }


        if(is != null) {
            is.close(); // 열려있는 입력 스트림을 닫음
        }
    }
}
