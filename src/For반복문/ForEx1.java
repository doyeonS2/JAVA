package For반복문;

import java.util.Scanner;

// for(초기식;최종식;증가식) {참인 동안 수행되는 문장;}
// 1 ~ 1000 사이의 7의 배수를 구하고 한줄에 10개씩 출력
// 정수 n을 입력받아 n * n 출력하기 (1부터 시작~~)
    // Input n : 3
    // Output
    // 1 2 3
    // 4 5 6
    // 7 8 9
// 정수 n 입력을 받음, 입력 받은 과목 수만큼의 성적 입력 받기, 총점과 평균 구하기
public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0; // 총점을 구하는 변수
        int score;
        System.out.print("과목수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            score = sc.nextInt();
            total += score;
        }
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", (double)total/n);

        }
    }