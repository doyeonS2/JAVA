package 쓰레드복습5;

import static java.lang.Thread.sleep;

public class ThEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh saveTh = new AutoSaveTh();
        saveTh.setDaemon(true);
        saveTh.start();
        sleep(5000);
    }
}
