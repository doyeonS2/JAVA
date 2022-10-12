package 람다멤버와변수;
// 람다식에서 클래스 멤버(필드와 메소드)와 로컬 변수 사용하기
interface MyFuncInterface {
    public void method();
}
class UsingThis {
    public int outerField = 10;
    class Inner {
        int innerField = 20;
        void method() {
            int localVal = 30; // 지역 변수는 final 특성을 가짐
            MyFuncInterface mi = () -> {
                System.out.println("외부 필드 : " + outerField);
                System.out.println("외부 필드 : " + UsingThis.this.outerField);
                System.out.println("내부 필드 : " + innerField);
                System.out.println("내부 필드 : " + this.innerField);
                System.out.println("지역 변수 : " + localVal);
            };
            mi.method();
        }
    }
}
public class LambdaVarMain {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
      //  UsingThis.Inner inner = UsingThis
    }
}
