package 쓰레드1;
// Thread 상속으로 쓰레드 생성 방법 (class 사용)
// Runnable 인터페이스로 구현하는 방법 (다른 상속을 받을 수 있어서 유리하다.)
// Runnable 이용한 익명객체로 구현하는 방법 (현재의 쓰레드 동작 중 복잡한 계산 등이 필요한 경우)
// 람다식을 이용하는 방법(표현 방식이 화살표 문법으로 간결해짐)
public class ThreadMainEx1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CustomThread(); // Thread를 상속한 객체 생성
        thread.start(); // 쓰레드 시작

        // Runnable 인터페이스로 생성
        // Runnable은 작업 내용에 대한 코드는 완성했지만 실제 쓰레드는 아님
        Runnable task = new RunnableThread();
        Thread thread2 = new Thread(task); // 쓰레드 생성
        thread2.start(); // 쓰레드 시작을 요청함

        // 익명의 객체로 쓰레드 생성 -> 람다 형식으로 변경
        Runnable task2 = () -> {
            try {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    Thread.sleep(10);
                    sum += i;
                    System.out.println("익명의 쓰레드 : " + sum);
                }
                System.out.println("익명의 쓰레드 : " + sum);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
        Thread thread3 = new Thread(task2); // 쓰레드 생성
        thread3.start(); // 쓰레드 시작을 요청함









        //System.out.println("여기는 Main 메소드 영역입니다.");

//        int sum = 0;
//        for(int i = 0; i <= 10; i++) {
//            Thread.sleep(10); // 100분의 1초
//            sum += i;
//            System.out.println("메인 쓰레드" + " : " + sum);
//        }
//
//        System.out.println("메인 쓰레드" + "합 : " + sum);
    }
}
