package 쓰레드복습;
// Thread 상속 받아서 만들기 - 쓰레드 용도로만 사용하고 끝!
public class CustThread extends Thread {
    @Override // 문법 체크 해달라고 오버라이드 - 부모가 가진 메소드를 재정의해서 쓰겠다!
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            try {
                sleep(10); // 100분의 1초 동안 잠자기 - 문맥 전환을 할 시간을 주기 위해 딜레이 주는 것!
            } catch(InterruptedException e) {
            }
            sum += i;
            System.out.println("쓰레드 상속 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
