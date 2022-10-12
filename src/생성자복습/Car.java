package 생성자복습;

public class Car {
    // 클래스 필드 : 클래스 생성 시 만들어지며 객체로 생성되지 않는다.
    static final String company = "현대자동차"; // final : 값도 그대로! 바뀌지 않음.
    String model;
    String color;
    int speed;
    int horsePower;
    Car() {}
    Car(String model) {
        this.model = model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 200;
        this.horsePower = 200;
    }
    Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
