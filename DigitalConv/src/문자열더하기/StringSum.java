package 문자열더하기;
import java.util.Scanner;
// N개의 숫자가 공백없이 입력됩니다. (12345)
// 15
// str.length(), str.charAt(인덱스), ASCII(?)
// sum += charAt(i) - '0';
public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sNum = sc.next();
        int sum = 0;
        for(int i = 0; i < sNum.length(); i++) {
            sum += sNum.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
