package 상속기본;
// 상속은 부모 클래스의 자원을 자식 클래스에 물려주는 것
// 키워드는 extends
// private 접근 제한자를 사용하면 상속을 줄 수 없다.
public class InheritanceMain {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이");
        houseDog.sleep();
    }
}
