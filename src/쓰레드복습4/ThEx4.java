package 쓰레드복습4;

import static java.lang.Thread.sleep;

// 쓰레드의 안전한 종료 : stop 플래그 사용
public class ThEx4 {
    public static void main(String[] args) throws InterruptedException {
//        RunTh1 runTh1 = new RunTh1();
//        runTh1.start();
//        sleep(1000);
//        runTh1.setStop(true);

        RunTh2 runTh2 = new RunTh2();
        runTh2.start();
        sleep(1000);
        runTh2.interrupt(); // interrupt : 특정 스레드에게 작업을 멈춰 달라고 요청하는 것!

    }
}
