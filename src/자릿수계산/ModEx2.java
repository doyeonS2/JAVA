package 자릿수계산;

import java.util.Scanner;

// 100자리의 정수를 입력 받아서 3개의 변수에 대입
// a는 100자리 수
// b는 10자리 수
// c는 1자리 수
// 입력 : 345 ==> a : 3, b : 4, c : 5
// 힌트는 몫과 나머지 연산을 활용
// 추가 과제는 3개 중 가장 큰 숫자 출력
public class ModEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100; // 몫을 구함
        int b = (num % 100) / 10;
        int c = num % 10;
        //if (a > b) {
        //    if(a > c) System.out.println(a);
         //   else System.out.println(c);
       // } else {
      //      if(b > c) System.out.println(b);
      //      else System.out.println(c);

          if (a > b) {
              System.out.println(Math.max(a,c));
          } else {
              System.out.println(Math.max(b,c));



        }


    }
}
