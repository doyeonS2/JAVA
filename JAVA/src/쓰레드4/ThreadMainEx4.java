package 쓰레드4;

import static java.lang.Thread.sleep;

// Join() : 쓰레드는 기본적으로 쓰레드간에 독립적으로 수행되는 것이 원칙
// 경우에 따라서는 다른 쓰레드의 결과 이후에 수행되어야 할 일이 발생함
// 이런 경우 join() 메소드 사용
// join(시간을 안주면 끝날 때까지 대기)
public class ThreadMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread= new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
        }

        //sleep(10);
        System.out.println("sumThread의 결과 : " + sumThread.getSum());

    }
}
