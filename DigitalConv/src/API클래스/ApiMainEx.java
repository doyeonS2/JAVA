package API클래스;
// java.lang.* : 기본적으로 포함되어 있음
// Object 클래스 : 모든 클래스의 최고 조상 클래스
// clone() 메소드 : 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환
// 객체를 복사하는 경우 참조 타입 변수인 경우 필연적으로 얕은 복사가 일어남
// 이런 문제를 해결하기 위해 clone() 메소드를 사용하며, clone() 메소드는
// 데이터의 보호 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 사용할 수 있음
public class ApiMainEx {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Car car1 = new Car();
//        Car car2 = new Car();
//        // 해당 인스턴스의 대한 정보를 문자열로 반환
//        // 16진수 해시 코드값은 주소값으로 인스턴스마다 다름
//        System.out.println(car1.toString());
//        System.out.println(car2.toString());
//        // epuals() 메소드 : 해당 인스턴스를 매개변수로 전달받는 참조변수와 비교
//        System.out.println(car1.equals(car2));
//        car2 = car1;
//        System.out.println(car1.equals(car2));
        Member mem1 = new Member("bear", "곰돌이", "12345", 30, true);
        Member mem2 = mem1.getMember();
        mem2.age = 18;
        mem2.name = "테스터";
        System.out.println("이름 : " + mem1.name);
        System.out.println("이름 : " + mem2.name);
        System.out.println("나이 : " + mem1.age);
        System.out.println("나이 : " + mem2.age);
    }
}
