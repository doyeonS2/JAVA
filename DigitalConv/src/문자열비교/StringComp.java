package 문자열비교;
import java.util.Scanner;

// 사용자에 의해 두 개의 문자열을 입력한다.
// 처음부터 두 개의 문자열을 비교하여 공통의 글자가 몇 개인지 확인합니다.
// 공통 부분 문자열과 그 길이를 인쇄합니다.
// 부분 문자열이 없으면 "NO CS"로 인쇄하고 0을 길이로 인쇄합니다.
// String str = sc.next();
// 문자열 길이를 확인하는 방법 : str.length()
// 문자열에서 한개의 문자를 비교하는 방법은 str.charAt(인덱스)
// ABCDEF
// ABCDDD
// ABCD   4
public class StringComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String a = sc.next();
        String b = sc.next();
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)) { // 문자열에서 해당 인덱스의 문자 비교
                System.out.print(a.charAt(i));
                cnt++; // 같은 문자의 갯수 누적
            } else break;
        }
        System.out.println();
        if(cnt != 0) System.out.println(cnt);
        else System.out.println("NO CS");
    }
}
