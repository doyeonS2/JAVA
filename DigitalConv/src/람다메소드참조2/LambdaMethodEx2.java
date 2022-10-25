package 람다메소드참조2;
import java.util.function.ToIntBiFunction;
// ToIntBiFunction<String, String> : 두개의 문자열을 입력받고 int 값 반환
// compareToIgnoreCase() : 두개의 문자열을 대소문자와 상관없이 동일한지 비교
public class LambdaMethodEx2 {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> func;
        // 두개의 매개변수를 입력받아 같은지 다른지에 대한 결과를 넘겨주는 구현부
        func = (a, b) -> a.compareToIgnoreCase(b);
        // print 메소드의 매개변수로 func.applyAsInt("Java11", "JAVA11")의 반환값을
        print(func.applyAsInt("Java11", "JAVA11"));
        func = String::compareToIgnoreCase;
        print(func.applyAsInt("Java11", "JAVA11"));
    }
    static void print(int order) {
        if(order < 0) System.out.println("사전순으로 먼저 옵니다.");
        else if(order == 0) System.out.println("동일한 문자열 입니다.");
        else System.out.println("사전순으로 나중에 옵니다.");
    }
}
