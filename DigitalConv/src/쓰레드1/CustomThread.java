package 쓰레드1;
// 상속을 통해 쓰레드 구현
// 상속을 구현하면 간단하게 쓰레드를 만들 수 있다.
// 다른 클래스 상속을 받을 수 없다.
// InterruptedException :
public class CustomThread extends Thread {
    @Override
    public void run() { // 쓰레드가 동작할 메소드 구현
        try {

            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                Thread.sleep(10); // 100분의 1초
                sum += i;
                System.out.println("생성된 쓰레드" + " : " + sum);
            }
            // currentThread() : 현재 동작하는 쓰레드를 알려줌
            System.out.println("생성된 쓰레드" + "합 : " + sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
