package 자기참조변수;
public class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    // 생성자 오버로딩이 많아지면 생성자 간의 중복코드가 발생할 수 있음
    // this() 생성자 내에서 다른 생성자를 호출할 때 사용
    Car(String modelName) {
        this(modelName, 2020, "은색", 250);
    }
    Car(String modelName, String color, int speed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car() {
        this("GV80", 2020, "Black", 230);
    }
    void viewCar() {
        System.out.println("차종 : " + modelName);
        System.out.println("연식 : " + modelYear);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + maxSpeed);
    }
    void viewCar(boolean notYear) {
        System.out.println("차종 : " + modelName);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + maxSpeed);
    }
}
