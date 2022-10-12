package 쓰레드3;
public class ThreadB extends Thread {
    boolean stop = false;
    boolean work = true;

    public void run() {
        while (!stop) {
            if(work) {
                System.out.println("ThreadB가 작업중입니다.");
            } else {
                Thread.yield();
            }
        }
    }
}
