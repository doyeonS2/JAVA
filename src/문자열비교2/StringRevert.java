package 문자열비교2;
import java.util.Scanner;
// 문자열 반전
// 문자열을 입력으로 사용
// 역기능으로 입력 문자열을 반전하여 출력합니다.
// 힌트 : for문을 사용하며 초기값은 배열의 크기보다 1 작게(인덱스 범위의 마지막)
// 종료값은 0이 될 때까지
public class StringRevert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String in = sc.next();
        for(int i = in.length()-1; i >= 0; i--) {
            System.out.print(in.charAt(i));
        }
        System.out.println();
    }
}
