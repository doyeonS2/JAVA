package 문자출력스트림;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Writer는 문자열 기반 출력 스트림의 최상위 추상 클래스입니다.
// 모든 문자 기반 출력 스트림 클래스는 이 클래스를 상속받아 만들어집니다.
public class ChWriteStMain {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("c:/파일입출력tmp/문자출력0816_02.txt");
        //char[] data = "곰돌이사육사".toCharArray(); // 문자열을 문자 배열로 변환시킴
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]); // 해당 인덱스 값을 write
//        }
        String data = "내일은 내일의 태양이 뜬다.";
        writer.write(data, 1, 5); // 스트링 타입에 대한 오버로딩 메소드가 있으므로..

        // writer.write(data); // write(char[]);
        writer.flush(); // 출력 이후는 버퍼를 비워줘야함(필수!!!!!!!!!!!!!!!!)
        writer.close(); // 출력 이후 자원 반납하고 열려있는 스트림을 닫음
    }
}
