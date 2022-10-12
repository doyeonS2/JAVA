package 배수구하기;

import java.util.Scanner;

// 7의 배수를 구하고 한줄에 10개씩 찍기
public class ForEx3 {
    public static void main(String[] args) {
        int cnt = 0; // 출력 횟수를 확인하기 위해서 사용
        for(int i = 1; i < 1000; i++) { // for문은 3개의 실행문으로 만들어져 있음
            if(i % 7 == 0) { // i 나누기 7을 해서 나머지가 0이면 7의 배수를 의미한다.
                System.out.printf("%4d", i); // 7의 배수를 출력하고, 공백 한 칸을 줌
                //cnt++; // 7의 배수를 출력하고 cnt를 1 증가시킴
                //if(cnt == 10) {
                    //System.out.printf("\n");
                    //cnt = 0; // 줄을 바꿨기 때문에 cnt를 0으로 초기화
                 //}

                //if(i % 10 == 0) System.out.printf("\n");
            }
                if(i % 70 == 0) System.out.printf("\n");
        }
    }
}
