package 상속어드밴스;
// 상속을 할 수 없는 클래스를 만드는 방법
// 오버라이딩 금지 방법
public class InheritanceEx2 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari");
        ElectricCar electricCar = new ElectricCar("아이오닉6");
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        electricCar.setAutoDrv(true);
        electricCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();
    }
}
