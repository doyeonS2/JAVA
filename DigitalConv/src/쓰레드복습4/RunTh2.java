package 쓰레드복습4;
public class RunTh2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("쓰레드 실행 중......");
                sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("자원 정리.....");
        System.out.println("실행 종료");
    }
}
