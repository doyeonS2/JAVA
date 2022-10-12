package 쓰레드4;

public class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 1000; i++) {
                Thread.sleep(10);
                sum += i;
            }
        } catch (InterruptedException e) {

        }
    }
}
