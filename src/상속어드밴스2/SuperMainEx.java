package 상속어드밴스2;
// super : 자식 클래스가 부모 클래스로부터 상속받은 멤버를 참조할 때 사용
// this : 인스턴스 필드와 매개 변수를 구분하기 위해 사용하는 것과 유사
// super() : 부모 생성자를 호출, 부모 생성자가 디폴트인 경우는 호출이 필요없음
public class SuperMainEx {
    public static void main(String[] args) {
        Child child = new Child(28);
        child.childMethod();
    }
}
class Parent {
    int x = 10;
    String name;
    Parent() {
    }
    Parent(int x) {
        this.x = x;
    }
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    int x = 20;

    Child(int x) {
        super("우영우");
    }
    void childMethod() {
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.x);
        System.out.println("이름 : " + name);
    }

}