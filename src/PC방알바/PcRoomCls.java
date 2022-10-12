package PC방알바;
import java.util.Scanner;
public class PcRoomCls {
    private int pcRoom[] = new int[100]; // pc방의 px 대수 // private 접근제한자
   private int person = 0;
   private int rejectCnt = 0;
    // 손님의 수를 입력받음
    void inputPerson() {
        Scanner sc = new Scanner(System.in);
        person = sc.nextInt();
    }
    // 손님이 요청한 자리가 예약되었는지 확인하고 거절 횟수를 누적하는 메소드
    void calcSeat() {
        int seatNumber = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < person; i++) {
            seatNumber = sc.nextInt();
            if(pcRoom[seatNumber - 1] == 1) rejectCnt++;
        }
    }
    int getRejectCnt() {
        return rejectCnt;
    }
}
