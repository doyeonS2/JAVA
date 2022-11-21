package 매개변수의다형성;
// 운전자 클래스
public class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    void drive(Vehicle vehicle) {
        System.out.println(name + "의 ");
        vehicle.run();
    }
}
