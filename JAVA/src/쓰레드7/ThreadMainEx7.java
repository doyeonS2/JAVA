package 쓰레드7;
// 쓰레드의 안전한 종료 방법 : interrupt()
// interrupt() : 일시 정지 상태에 있을 때 InterruptException
public class ThreadMainEx7 {
    public static void main(String[] args) throws InterruptedException {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(1000);
        interruptThread.interrupt();

    }
}
