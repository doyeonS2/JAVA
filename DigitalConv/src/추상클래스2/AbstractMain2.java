package 추상클래스2;

public class AbstractMain2 {
    public static void main(String[] args) {
        SmartPhone smart = new SmartPhone("Galaxy G-Flip");
        smart.setPower(true);
        smart.internet();
        smart.call();
    }
}
