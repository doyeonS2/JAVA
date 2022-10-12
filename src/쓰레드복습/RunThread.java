package 쓰레드복습;
import static java.lang.Thread.sleep;

// 인터페이스 상속 - 다른데서 상속 또 받아도 됨!
public class RunThread implements Runnable {
    @Override
    public void run() {
        Thread custThread = new CustThread(); // 쓰레드 객체 생성
        custThread.start();

        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            try {
                sleep(10); // 100분의 1초 동안 잠자기 - 문맥 전환을 할 시간을 주기 위해 딜레이 주는 것!
            } catch(InterruptedException e) {
            }
            sum += i;
            System.out.println("인터페이스 상속 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);

    }
}
