package 상속어드밴스;
// 기본 클래스 : 상속을 주기위한 클래스
public class Car {
    int speed;
    String color;
    String name;
    final void accelerator() { // 가속 기능
        System.out.println("차의 속도를 증가시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }
}
class SportsCar extends Car {
    boolean isTurbo;
        SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }
    int getSpeed() { // getter 메소드
    if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean isTurbo() {
        return isTurbo;
    }
    void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
//    @Override
//    void accelerator() {
//        System.out.println("속도를 200% 증가합니다.");
//    }
//    @Override
//    void breakPanel() {
//        System.out.println("차를 정지 상태로 만듭니다.");
//    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed()); // 클래스 내부의 메소드 호출
        System.out.println("색상 : " + color);
    }
}
class ElectricCar extends Car {
    boolean isAutoDrv; // 자율주행 모드
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean isAutoDrv() {
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed); // 클래스 내부의 메소드 호출
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);
    }
}