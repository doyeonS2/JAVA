package 쓰레드8;

import 쓰레드5.ThreadA;

// 동기화 synchronized : 공유 영역에 대한 동시 접근을 허용하지 않음
public class ThreadMainEx8 {
    public static void main(String[] args) {
        // 정보를 공유할 객체 생성
        SharedThreadEx8 shared8 = new SharedThreadEx8();
        // 익명의 쓰레드를 람다로 생성
        Thread thread1 = new Thread(()->{
          shared8.setValue(100);
        });
        Thread thread2 = new Thread(()->{
            shared8.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}
