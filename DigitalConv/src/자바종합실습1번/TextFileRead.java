package 자바종합실습1번;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TextFileRead {
    public static void main(String[] args) {
        FileInputStream fis = null; // 가리키고 있는 주소가 없다.
        // TreeSet은 이진트리로 트리 생성 시 자동 정렬 특성을 가짐 (Comparable 기준으로)
        TreeSet<StudentInfo> treeSet = new TreeSet<>();
        try {
            // FileInputStream은 InputStream의 자식이며 바이트로 파일에서 데이터를 읽음
            fis = new FileInputStream("src/자바종합실습1번/score.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        // 스캐너의 입력은 콘솔 이외의 파일로부터도 읽어 들일 수 있음
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) { // 읽어 들일 다음 라인이 있는지 검사
            String line = sc.nextLine(); // 개행문자(엔터키) 기준으로 읽어들임
            String[] strArr = line.split(" ");
            treeSet.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]), // 문자열을 정수로 변환
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for(StudentInfo e : treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
