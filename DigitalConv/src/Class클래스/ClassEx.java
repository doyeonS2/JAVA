package Class클래스;
public class ClassEx {
    public static void main(String[] args) {
        Car car = new Car();
        Class cls = car.getClass(); // Class 클래스
        System.out.println(cls.getName()); // 패키지 이름과
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getSuperclass());
        System.out.println(cls.getPackage().getName());
    }
}
class Car {}