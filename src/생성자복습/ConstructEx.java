package 생성자복습;
// 생성자의 주요 임무는 인스턴스 필드에 대한 초기화 작업을 진행
public class ConstructEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carInfo();
        Car car2 = new Car("그랜저");
        car2.carInfo();
        Car car3 = new Car("G80", "Red");
        car3.carInfo();
        Car car4 = new Car("아이오닉6", "White", 220, 250);
        car4.carInfo();
    }
}
