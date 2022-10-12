package 람다메소드참조3;
import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
// 메소드 참조에는 생성자 참조를 포함합니다.
// 메소드 참조 : 클래스 필드, 인스턴스 필드, 매개변수 참조, 생성자 참조
public class LambdaMethodEx3 {
    public static void main(String[] args) {
        // 한개의 double형 매개변수를 전달받아 한개의 double형 값을 반환
        DoubleUnaryOperator oper;
        oper = (n) -> Math.abs(n);
        System.out.println(oper.applyAsDouble(-5));
        oper = Math::abs; // 메소드 참조 표현식
        System.out.println(oper.applyAsDouble(-5));



//        // 1개의 인자를 받고 1개의 객체를 반환하는 함수형 인터페이스
//        Function<String, TestMember> function = TestMember::new;
//        TestMember mem1 = function.apply("곰돌이사육사");
//        BiFunction<String, String, TestMember> function1 = TestMember::new;
//        TestMember mem2 = function1.apply("곰돌이사육사", "달빛사냥꾼");
//    }
//}
//class TestMember {
//    private String name;
//    private String id;
//    public TestMember() {
//        System.out.println("기본 생성자 실행");
//    }
//    public TestMember(String name, String id) {
//        this.name = name;
//        this.id = id;
//        System.out.println("이름 : " + name + ", " + id);
//    }
//    public TestMember(String name) {
//        this.name = name;
//        System.out.println("생성자 호출 !! 이름 : " + name);
    }
}