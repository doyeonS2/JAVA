package 쓰레드7;

public class InterruptThread extends Thread{
    @Override
    public void run() {
        try {
            while (true) { // 탈출 조건이 없음
                System.out.println("쓰레드 실행중......");
                Thread.sleep(1); // Interrupt() 호출을 위해 반드시 필요
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
