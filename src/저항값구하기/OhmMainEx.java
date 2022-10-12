package 저항값구하기;

import java.util.Scanner;
// 3개의 컬러값을 입력받음
// 첫번째 입력 10의 자리
// 두번째 입력 1의 자리
// 세번째 곱하기 값
public class OhmMainEx {
    public static void main(String[] args) {
        //컬러값에 대한 문자열 배열 선언
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        int first = 0;
        int second = 0;
        int third = 0;

        Scanner sc = new Scanner(System.in);

        String color1 = sc.next();
        String color2 = sc.next();
        String color3 = sc.next();

        for(int i = 0; i < 10; i++) {
            if (color1.equals(color[i])) first = i;
            if (color2.equals(color[i])) second = i;
//            if (color3.equals(color[i])) third = mul[i];
            if (color3.equals(color[i])) third = i;
        }
        // 범위가 정수형 범위를 벗어나기 때문에 long 붙여줌
        System.out.println((long)((first * 10) + second) * (long)(Math.pow(10,third)));
    }
}
