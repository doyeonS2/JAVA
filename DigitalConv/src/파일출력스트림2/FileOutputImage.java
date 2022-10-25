package 파일출력스트림2;

import java.io.*;

// 바이트 기반 출력 스트림으로 이미지 파일 읽고 쓰기
public class FileOutputImage {
    public static void main(String[] args) throws IOException {
        String originalFileName = "C:/파일입출력tmp/bear.webp";
        String targetFileName = "src/파일출력스트림2/copyBear.jpg";
        FileInputStream fis = new FileInputStream(originalFileName);
        OutputStream fos = new FileOutputStream(targetFileName);
        int readByteNo;
        byte[] readBytes = new byte[100]; // 한번에 100 byte씩 읽음
        // 읽을 내용이 있는 동안 반복 수행
        while((readByteNo = fis.read(readBytes)) != -1) {
            // 파일의 내용을 읽어 시작부터 읽은 크기 만큼을 target 파일에 씀
            fos.write(readBytes, 0, readByteNo);
        }
        fos.flush(); // 출력 버퍼 비우기
        fos.close(); // 출력 스트림에 대한 자원 반납 및 닫기
        fos.close(); // 입력 스트림에 대한 자원 반납 및 닫기기
    }
}
