package 데이터와변수;

import java.util.Scanner;

// 각 데이터형에 대한 변수 선언
// 변수의 사용 범위 : 지역변수는 중괄호 {}내에서 생존한다.
// 괄호에 대해서 : []대괄호는 배열을 의미, {}중괄호는 메소드나 클래스의 범위,
// ()소괄호는 메소드의 매개변수 목록을 넣는 부분
// 상수 : 상수는 값이 한번 정해지면 변경이 불가능한 변수를 의미 (final)
// 타입 변환 : 하나의 타입을 다른 타입으로 변환하는 것
// 정수형을 문자형으로 변경하는 것 : 제공되는 메소드를 사용
// 명시적 형변환은 개발자가 의도를 가지고 형을 변경하는 것
// 묵시적 형변환은 컴파일러가 유리한 방향으로 자동으로 형변 변경
public class DataValMain {
    public static void main(String[] args) {
        int kor, eng, mat;
        int total;
        double aver; // 평균을 저장할 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적 입력 : ");
        kor = sc.nextInt();
        System.out.print("영어 성적 입력 : ");
        eng = sc.nextInt();
        System.out.print("수학 성적 입력 : ");
        mat= sc.nextInt();
        aver = kor + eng + mat;
        total= kor + eng + mat;
        aver = total/3;
        System.out.println("평균 : " + aver);
        //문자열을 정수 타입으로 변환하는 메소드
        String strX = "100";
        int x = Integer.parseInt(strX);
        System.out.printf("x : %d\n", x);
        String strY = "100.33";
        double dY = Double.parseDouble(strY);
        System.out.printf("y : %.2f\n", dY);

        // 진수에 대한 표현
        int var1 = 0b1010; // 2진수
        int var2 = 0206;   // 8진수
        int var3 = 365;    // 10진수
        int var4 = 0xB3;   // 16진수
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);






    }
}