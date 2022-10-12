package 요금제계산하기;

import java.util.Scanner;

// 영식(Y) 요금제 : 30초당 10원 (30초가 되면 2통이 됨)
// 민식(M) 요금제 : 60초당 15원 (60초가 되면 2통이 됨)
// 입력 : 통화 횟수가 첫째줄에 입력되고 통화 횟수에 대한 시간이 각각 입력됨
// 만약 총 요금이 같은 경우 Y M 통화 요금
// 3 (통화 횟수) : 총 통화 횟수는 20을 넘지 않는다.
// 통화횟수 : 3
// 통화시간 : 40 40 40
// 결과 : M 45
public class PriceCalcEx {
    public static void main(String[] args) {
        // 통화 시간에 대한 배열을 만듦 (20개)
        int[] call = new int[20];
        int yPare = 0, mPare = 0; // 영식 요금제와 민식 요금제를 구하기 위한 변수
        // 스캐너를 만들어 통화횟수 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("통화횟수 입력 : ");
        int cnt = sc.nextInt();
        // 반복문을 돌면서 통화횟수에 대한 통화 시간을 배열에 넣음
        for(int i = 0; i < cnt; i++) {
            call[i] = sc.nextInt();
        }
        // 통화 횟수 만큼 반복문을 돌면서 요금을 계산해서 누적함
        for(int i = 0; i < cnt; i++) {
            yPare += (call[i] / 30) * 10 + 10; // 기본 1통 + (30초당 1통)
            mPare += (call[i] / 60) * 15 + 15; // mPare = mPare + (call[i] / 60) * 15 + 15
        }
        // 영식 요금제와 민식 요금제를 비교해서 싼 요금제를 출력함
        if (yPare > mPare) {
            System.out.println("M " + mPare);
        } else if(yPare < mPare) {
            System.out.println("Y " + yPare);
        // 같으면 Y M 으로 출력
        } else {
            System.out.println("Y M " + yPare);
        }



    }
}
