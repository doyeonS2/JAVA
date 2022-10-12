package 다형성기본;

public class Parent {
    protected int num = 100; // 상속을 주기 위해 접근제한자를 protected
    public void display() {
        System.out.print("부모 클래스의 메소드..");
    }
}
class Child extends Parent {
    private int x = 100;
    public Child() {}
    public void out() {
        System.out.println("부모의 protected num 필드 : " + num);
        System.out.println("자식 클래스 메소드");
    }
    @Override
    public void display() {
        System.out.println("상속 받아서 재정의(오버라이딩)...");

    }

}
