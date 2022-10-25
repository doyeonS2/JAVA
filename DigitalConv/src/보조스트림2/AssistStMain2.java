package 보조스트림2;
import java.io.*;

// OutputStreamWriter() : 바이트 출력 스트림을 문자 출력 스트림으로 변환
public class AssistStMain2 {
    public static void main(String[] args) throws IOException {
        // 바이트 출력 스트림
        OutputStream fos = new FileOutputStream("C:/파일입출력tmp/file.txt");
        // 문자 출력 스트림
        Writer writer = new OutputStreamWriter(fos, "UTF-8"); // 보조스트림 연결
        String data = "하루에 3시간씩 걸으면 7년 후에 지구를 한바퀴 돌 수 있다.";
        writer.write(data);
        writer.flush();
        writer.close();

    }
}
