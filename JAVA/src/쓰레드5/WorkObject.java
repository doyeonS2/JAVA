package 쓰레드5;
// 작업 공유용 클래스
public class WorkObject {
    // synchronized는 쓰레드의 동시 접근에 대한 허용을 막음
    public synchronized void methodA() {
        System.out.println("Thread methodA() 작업 실행");
        notify(); // 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 만듦
        try {
            wait(); // ThreadA를 일시정지 상태로 만듦
        } catch (InterruptedException e) {

        }
    }
    // synchronized 가 없으면 동시 접근 문제가 발생함
    public synchronized void methodB() {
        System.out.println("Thread methodB() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듦
        try {
            wait(); // ThreadB를 일시 정지 상태로 만듦
        } catch (InterruptedException e) {

        }
    }
}
