package 쓰레드2;
import java.awt.*;
// sleep() : 실행중인 쓰레드를 일정 시간 멈추고 싶을 때 사용
// Thread.sleep(시간) : 시간은 1000분의 1초 단위
// Thread.sleep(시간) 메소드를 호출한 쓰레드는 주어진 시간동안 일시정지 상태가 되고,
// 시간이 지나면 실행 대기 상태가 됩니다.
// sleep 상태에서는 interrupt exception을 발생 시킬 수 있습니다.
// 즉, interrupt() 메소드 호출 시 주어진 시간이 경과하지 않더라도 깨어남
public class ThreadMainEx2 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i <10; i++) {
            toolkit.beep(); // 소리 비프음 출력
            try {
                Thread.sleep(3000); // 3초 동안 잠자기
            } catch (InterruptedException e) {
                System.out.println(e); // e는 예외상황에 대한 에러 문구 출력
            }
        }
    }
}
