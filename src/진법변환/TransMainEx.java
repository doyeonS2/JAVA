package 진법변환;
import java.util.Scanner;
// 입력받은 8진수를 2진수로 변환하기
// 0이 앞에 오면 안됨
public class TransMainEx {
    public static void main(String[] args) {
        final String[] mBin = {"000", "001", "010", "011", "100", "101", "110", "111"};
        final String[] fBin = {"", "1", "10", "11", "100", "101", "110", "111"};
        Scanner sc = new Scanner(System.in);
        System.out.print("8진수 입력 : ");
        String oct = sc.next();
        for(int i = 0; i < oct.length(); i++) {
            // 0 입력되는 경우에 대한 처리
            if(oct.length() == 1 && oct.charAt(0) - '0' == 0) {
                System.out.print("0");
                break;
            }
            if(i == 0) {
                System.out.print(fBin[oct.charAt(0)-'0']);
            } else {
                System.out.print(mBin[oct.charAt(i)-'0']);
            }
        }
        System.out.println();
    }
}
