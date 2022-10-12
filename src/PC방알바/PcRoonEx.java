package PC방알바;
import java.util.Scanner;
// PC는 총 100대 : 배열을 100개 생성(int)
// 첫번째 입력은 손님의 수
// 손님의 수만큼 원하는 좌석 번호를 입력받음
// 이미 예약된 좌석의 경우 거절하고 거절 횟수를 누적
// 결과는 몇번 거절이 발생했는지 결과 출력
public class PcRoonEx {
    public static void main(String[] args) {
//        int pcRoom[] = new int[100];
//        int seatNumber, rejectCnt = 0;
//        // 손님의 수와 손님이 요청하는 좌석을 입력받기 위한 스캐너 객체 생성
//        Scanner sc = new Scanner(System.in);
//        // 손님의 수를 정수로 입력받음
//        int n = sc.nextInt();
//        // 손님의 수만큼 반복문을 수행하면서 손님이 원하는 좌석 번호를 입력받음
//        for(int i = 0; i < n; i++) { // 손님의 수만큼 좌석 번호를 입력받기위한 범위
//            seatNumber = sc.nextInt(); // 손님이 요청하는 좌석 번호
//            if(pcRoom[seatNumber - 1] == 1) rejectCnt++; // 1의 의미하는 것은 예약된 자리
//            else pcRoom[seatNumber - 1] = 1; // 여기서 1은 해당 좌석을 예약한다는 의미
//        }
//        System.out.println("거절 횟수 : " + rejectCnt);
//        // 입력받은 좌석 번호가 배열에서 예약된 자리인지를 확인(좌석번호에서 배열 인덱스 1빼줌)


        PcRoomCls pcRoomCls = new PcRoomCls();
        pcRoomCls.inputPerson(); // 사용자 수를 입력 받음
        pcRoomCls.calcSeat(); // 사용자가 요청한 좌석에 따라 거절 횟수 누적
        System.out.println(pcRoomCls.getRejectCnt());
            }
        }

// == : 비교연산자로 "같다"라는 의미
// = : 대입연산자로 대입한다는 의미(해당 배열에 값을 넣는다는 의미)