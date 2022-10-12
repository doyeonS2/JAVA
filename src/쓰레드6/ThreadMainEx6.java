package 쓰레드6;
import java.util.Scanner;

// 쓰레드의 안전한 종료 방법 : stop 플래그, interrupt()
// stop flag(true/false) 이용 방법
public class ThreadMainEx6 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
//        Thread.sleep(1000);
//        runThread.setStop(true);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("실행을 중지 하시겠습니까?(quit/no) : ");
            String isQuit = sc.next();
            if(isQuit.equalsIgnoreCase("quit")) {
                Thread.sleep(1000);
                runThread.setStop(true);
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            Thread.sleep(1000);
            runThread.setStop(true);
        }
    }
}
