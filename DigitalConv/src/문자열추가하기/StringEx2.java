package 문자열추가하기;

import java.util.Scanner;

// 2개의 문자열 입력받음, 정수 갯수 만큼의 문자열을 첫번째 문자열 뒤에서부터 자름
// 두번째 문자열 앞에 붙임
// 첫번째 : seoul
// 두번째 : korea
// 정수 : 2
// 결과 : ulkorea
public class StringEx2 {
    public static void main(String[] args) {
        // 문자열을 입력받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 첫번째와 두번째 문자열을 각각 입력받음
        System.out.println("첫번째 문자열 : ");
        String firstStr = sc.next();
        System.out.println("두번째 문자열 : ");
        String secondStr = sc.next();
        // 정수를 입력받음
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        // 첫번째 입력받은 문자열에서 n의 갯수 만큼을 뒤에서부터 자름
        int pos = firstStr.length() - n; // 문자열 길이로부터 n의 갯수만큼 이동한 위치를 찾아냄
        String sub = firstStr.substring(pos);
        System.out.println(sub + secondStr);
    }
}