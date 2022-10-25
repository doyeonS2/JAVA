package 직업상속과인터;
public abstract class Person {
    String name; // 인스턴스 필드가 포함될 수 있다.
    int age;
    abstract void eat(); // 추상 메소드는 구현부를 가지면 안된다.
    // 생성자를 생략하면 기본 생성자가 호출된다.
}
