package 쓰레드복습3;

public class ThreadA extends Thread {
    private WorkObject workObject;
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject; // workObject 의 주소를 넘겨서 이 내부에서 사용하겠다!
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}
