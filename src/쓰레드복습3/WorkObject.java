package 쓰레드복습3;

public class WorkObject {
    // synchronized : 멀티쓰레드로 동시에 접근되는 것을 막는다!
    public int test = 100;
    public synchronized void methodA() {
        test++;
        System.out.println("Thread의 methodA() 작업 수행 : " + test);
        notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦 - 상대방한테 거는 것!
        try {
            wait(); // 자신을 일시정지 상태로 만듦 - 자기 자신한테 거는 것!
        }  catch (InterruptedException e) {
        }
    }
    // 메소드가 동시접근 허용을 안한다!
    public synchronized void methodB() {
        test++;
        System.out.println("Thread의 methodB() 작업 수행 : " + test);
        notify();
        try {
            wait();
        }  catch (InterruptedException e) {}
    }
}
