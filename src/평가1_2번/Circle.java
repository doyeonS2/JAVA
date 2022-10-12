package 평가1_2번;
// UML로 표기된 다이어그램에서 접근제한자 매개변수를 확인
// + : public
// - : private
// Circle(radius:double) -> (radius:double) 없으면 틀린 것!
// 언더바______있으면 상수다! 변경이안되는것! final!
public class Circle {
    // 접근제한자 (+), 더 이상 변경 불가능 하도록 final로 선언함
    public final static double PI = 3.14;
    // 접근제한자 (-), 클래스 내부에서 접근 가능(1번)
    private double radius;
    // 기본 생성자가 아니고 매개변수가 있는 생성자임(2번)
    public Circle(double radius) { //(radius:double) 없으면 틀린 것!
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    // 새터/게터는 인스턴스 필드에 대해서 값을 읽거나 쓰기 위한 메소드를 만드는 것

    public void draw() {
        System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
    }

}
