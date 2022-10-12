package 상속종합TV;
// 상속 : Prototype TV로부터 상속받아서 Product TV를 만듦
// 오버라이딩 : 채널 설정을 499개에서 999개로 변경함(부모의 메소드를 재정의)
// 오버로딩 : 채널 설정을 오버로딩해서 인터넷 모드를 추가함(동일한 메소드를 매개변수의 갯수나 타입으로 자동 호출함)
// super() : Product TV생성자 호출시 부모의 생성자를 호출함
public class TvUpgradeMain {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(45);
        lgTV.setChannel(3, true);
        lgTV.viewTV();

    }
}
