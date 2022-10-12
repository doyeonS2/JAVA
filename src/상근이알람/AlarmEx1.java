package 상근이알람;
import java.util.Scanner;
// 상근이 알람 설정하기(시간과 분은 각각의 변수로 따로 받음), nextInt() 2번 사용
// 24시간제이고 입력받은 시간에서 45분 빼서 시간을 설정
// 힌트 : 시간을 분으로 환산해서 계산하고 다시 시간과 분으로 변경
// 0:30과 같은 경우를 고민(???) if문으로 처리가 가능
// 필요 문법 : 나머지 연산자와 조건문
// 출력은 시간과 분으로 출력
public class AlarmEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, min, calc; // 시간, 분, 시간과 분을 분으로 환산
        System.out.print("시간 입력 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        calc = (hour * 60) + min; // 입력받은 시간과 분을 분으로 환산
        if(calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45; // calc = calc - 45;
        System.out.println("알람 : " + (calc / 60) + "시" + (calc % 60) + "분");





    }
}
