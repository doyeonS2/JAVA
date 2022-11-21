package 파일입출력스트림3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Scanner 입력을 파일로부터 받기
public class FileInOutStEx {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream =
                new FileInputStream("C:/파일입출력tmp/문자출력0816_01.txt");

        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) { // 읽을 라인이 있는지 확인
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
