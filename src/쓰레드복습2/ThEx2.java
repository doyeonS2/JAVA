package 쓰레드복습2;
// join : 다른 쓰레드의 수행 결과를 기다림
public class ThEx2 {
    public static void main(String[] args) {
        SumTh sumTh = new SumTh();
        sumTh.start();
        try {
            sumTh.join(500); // try - catch 로 예외처리!
        } catch (InterruptedException e) {}
        System.out.println("합 : " + sumTh.getSum());
    }
}
