package 아이패드만들기;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPad iPad = new IPad("iPad Pro");
            if (!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.progressPad();
            iPad.productPad();
        }

    }
}
