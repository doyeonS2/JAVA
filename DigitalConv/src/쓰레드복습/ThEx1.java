package 쓰레드복습;
// 쓰레드 생성
// Thread class를 이용

import static java.lang.Thread.sleep;

public class ThEx1 {
    public static void main(String[] args) {
        // 쓰레드 클래스를 상속받아 만듦
        Thread custThread = new CustThread(); // 쓰레드 객체 생성
        custThread.start();
        // Runnable 인터페이스 상속받아 만듦
        Runnable task = new RunThread(); // RunThread는 작업 내용은 가지고 있지만 쓰레드는 아님
        Thread runThread = new Thread(task);
        runThread.start();

        // 익명의 쓰레드 생성 - 클래스를 만들지 않음. why? 임시로 사용할 일회용 쓰레드를 만들고 싶을 때 사용! 클래스는 재활용의 목적이 있음!
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    try {
                        sleep(10); // 100분의 1초 동안 잠자기 - 문맥 전환을 할 시간을 주기 위해 딜레이 주는 것!
                    } catch(InterruptedException e) {
                    }
                    sum += i;
                    System.out.println("익명 쓰레드 : " + sum);
            }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };
        Thread anonymousTh = new Thread(task2);
        anonymousTh.start();

        Runnable task3 = () -> {
            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                try {
                    sleep(10); // 100분의 1초 동안 잠자기 - 문맥 전환을 할 시간을 주기 위해 딜레이 주는 것!
                } catch(InterruptedException e) {
                }
                sum += i;
                System.out.println("람다 쓰레드 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);

        };
        Thread lambdaTh = new Thread(task3);
        lambdaTh.start();

        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            try {
                sleep(10); // 100분의 1초 동안 잠자기 - 문맥 전환을 할 시간을 주기 위해 딜레이 주는 것!
            } catch(InterruptedException e) {
            }
            sum += i;
            System.out.println("메인 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
