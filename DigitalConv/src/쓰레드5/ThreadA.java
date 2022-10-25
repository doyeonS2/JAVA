package 쓰레드5;

public class ThreadA extends Thread {
    private  WorkObject workObject;

    // 생성자 호출
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}
