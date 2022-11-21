package 쓰레드복습4;

public class RunTh1 extends Thread {
    private boolean stop; // 플래그는 boolean 타입으로 만들기!
    public void setStop(boolean stop) { // private 으로 접근제한 했으니, 접근할 수 있게 해주기!
        this.stop = stop;
    }
    public void run() {
        while (!stop) { // while (stop == false)랑 같은 의미!
            System.out.println("Thread 실행 중.......");
        }
        System.out.println("자원 정리...");
        System.out.println("실행 종료");


    }
}
