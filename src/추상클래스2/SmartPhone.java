package 추상클래스2;
public class SmartPhone extends Phone {
    public SmartPhone(String name) {
        super(name); // 부모의 생성자를 호출
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 완성합니다.");
    }
    public void internet() {
        System.out.println("인터넷을 검색합니다.");
    }
}
