package 쓰레드6;

public class RunThread extends Thread{
    private boolean stop; // stop 플래그 생성
    // stop 플래그 설정을 위해 setter 메소드 구현
    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        while (!stop) {
            // System.out.println("Thread 실행 중....");
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("자원 정리 중.....");
        System.out.println("실행 종료.");
    }
}
