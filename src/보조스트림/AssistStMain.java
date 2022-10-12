package 보조스트림;

import java.io.*;

// 기본 스트림에 보조 스트림을 연결해서 사용함
// 목적은 입/출력 빈도를 줄여 성능 향상, 데이터 형식 변환 등에 사용
// 보조스트림 참조변수 = new 보조스트림(기본스트림);
// InputStreamReader() : 바이트 스트림과 문자 스트림을 연결할 수 있도록 해줌
// 인코딩 방식을 지정해 사용할 수 있습니다.
public class AssistStMain {
    public static void main(String[] args) throws IOException {
        //InputStream is = new FileInputStream("C:/파일입출력tmp/문자출력0816_01.txt");
        InputStream is = System.in; // 바이트 스트림으로 입력 받음
        // InputStreamReader() : 기본 인코딩을 사용하는 객체 생성
        Reader reader = new InputStreamReader(is, "UTF-8"); // 바이트 스트림과 문자 스트림을 연결
        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = reader.read(cbuf)) != -1) {
            String data = new String(cbuf, 0, readCharNo);
            System.out.println(data);
        }
        reader.close();
    }
}
