package 조건문예제2;

import java.util.Scanner;

// 시험 성적을 입력 받아서 90점 이상은 A, 80점 이상한 B, 70점 이상은 C, 60점 이상은 D
// 나머지는 F
// 입력받은 시험 성적이 0 ~ 100 사이가 아니면 "성적이 잘못 입력되었습니다."
public class GradeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요. : ");
        int score = sc.nextInt(); // 성적을 입력받아 score 변수에 대입
        if(score < 0 || score > 100) {
            System.out.println("성적이 잘못 입력되었습니다.");
            return;
        } else if (score >= 90) {
            System.out.printf("A");
        } else if (score >= 80) {
            System.out.printf("B");
        } else if (score >= 70) {
            System.out.printf("C");
        } else if (score >= 60) {
            System.out.printf("D");
        } else {
            System.out.printf("F");
        }

    }
}
