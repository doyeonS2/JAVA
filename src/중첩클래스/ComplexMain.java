package 중첩클래스;
// 하나의 클래스 내부에 선언된 또 다른 클래스를 의미
public class ComplexMain {
    public static void main(String[] args) {
      A a = new A();
      A.B b = a.new B(); // 내부 객체를 생성하기 위해서는 외부 객체를 만들어야함
      b.testMethod();
      System.out.println(A.C.test); // 중첩 클래스 내부에 정적 클래스 호출
    }
}
class A {
    class B { // 인스턴스 멤버 클래스
        void testMethod() {
            System.out.println("중첩 클래스 메소드 입니다.");
        }
    }
    static class C { // 정적 멤버 클래스
        static String test = "test";

    }
}
