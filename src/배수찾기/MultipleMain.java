package 배수찾기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 첫째줄에 n값 입력받음 (n값이 3이라고 가정하고...)
// 둘째줄부터 입력받는 수가 n의 배수인지 확인하는 문제
// 예를 들어 99가 입력되면 99 is a multiple of 3."
// 예를 들어 7이 입력되면 "7 is NOT a multiple of 3."
// 0이 입력되면 종료
public class MultipleMain {
    public static void main(String[] args) {
        // ArrayList 생성하기
        List<Integer> list = new ArrayList<>();
        // 키보드 입력을 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // n값을 입력 받기
        int tmp; // 키보드를 통해서 값을 입력받는 변수
        int n = sc.nextInt();
        // 무한의 횟수를 반복하는 반복문 만들기(탈출 조건은 0 입력)
        while(true) {
            // 반복문을 돌면서 계속 값을 입력받아 리스트에 담기(add)
            tmp = sc.nextInt();
            if(tmp == 0) break;
            list.add(tmp);
        }
        // 반복문이 끝나면 다시 반복문을 돌면서 배수인지 아닌지 확인해서 출력
        for(Integer e : list) {
            if (e % n == 0) System.out.println(e + " is a multiple of " + n + ".");
            else System.out.println(e + " is NOT a multiple of " + n + ".");

        }

    }
}
