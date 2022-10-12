package 손익분기점;

import java.util.Scanner;

// 월드전자에서 생산하는 노트북이 몇대 팔려야 이익이 발생하는가를 묻는 문제
// 입력 : 고정비용 가변비용 판매단가
// 몇대를 팔아야 손익분기점을 달성하는가를 묻는 문제
// 손익분기점이 존재하지 않으면 -1 (손익분기점이 존재하지 않는 경우: 손해보고 파는 경우..ㅎ)
public class eventPointEx {
    public static void main(String[] args) {
        // 스캐너 객체를 생성해서 고정비용 가변비용 생산비용을 입력받음
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice  = sc.nextInt();
        // 손익분기점을 달성할 수 없으면 -1을 출력하고 끝냄(예외 처리->return)
        // 손익분기점 달성 여부 확인은 반복문을 사용해도 되고 공식을 이용해도 됨
        // 결과 출력은 판매 대수
        if(varCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        //while(true) {
            //if(fixCost + (varCost * cnt) < sellPrice * cnt) break; ----> 강사님이 푼 거

//            ----> 공식 활용한 거
//            if(cnt > fixCost / (sellPrice - varCost)) break;
//            cnt++;
       // }
        //System.out.println(cnt);

        System.out.println((fixCost / (sellPrice - varCost)) + 1);

    }

}


