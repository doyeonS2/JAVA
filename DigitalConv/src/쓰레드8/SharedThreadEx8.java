package 쓰레드8;

public class SharedThreadEx8 {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName()
                + "의 Value : " + this.value + " 입니다.");
    }
}
