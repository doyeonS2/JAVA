package 쓰레드복습2;

public class SumTh extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            try {
            sleep(10);
        } catch (InterruptedException e) {}
            sum += 1;
        }
    }
}
