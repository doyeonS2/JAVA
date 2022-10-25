package 래퍼클래스;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer num = 17;
        int n = num;
        System.out.println(n);
        Character ch = 'X';
        char c = ch; // 언박싱이 일어남
        System.out.println(c);
    }
}
