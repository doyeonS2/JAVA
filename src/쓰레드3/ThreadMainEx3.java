package 쓰레드3;
// yield() : 다른 쓰레드에게 실행을 양보하는 것
// 대기 상태로 가는것이 아니고 현재 수행 순서를 양보함 (수행 대기열을 건너뜀)
public class ThreadMainEx3 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        threadA.work = false; // thread A 일 중지

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        threadA.work = true; // thread A, thread B 둘 다 동작

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            threadA.stop = true;
            threadB.stop = true;
        }


    }
}
