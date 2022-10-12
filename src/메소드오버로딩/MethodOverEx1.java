package 메소드오버로딩;
// 메소드오버로딩이란?
// 동일한 메소드를 여러개 정의를 하고 매개변수의 갯수와 타입에 따라 다양하게 호출
// 매개변수가 같고 반환타입만 다른 경우는 안된다.
// 메소드 오버로딩은 객체지향 프로그램의 다향성에 대한 특성이다.
public class MethodOverEx1 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.00, 20, 30));
        System.out.println(sum("seoul", "korea", "gangnam"));
    }
    static int sum(int x, int y, int z) {
        System.out.println("정수 정수 정수 메소드 호출");
        return x + y + z;
    }
    static double sum(double x, double y, int z) {
        System.out.println("더블 더블 정수 메소드 호출");
        return x + y + z;

        // 매개변수의 목록이 같고 반환형만 다른 경우는 안됨
//        static double sum(int x, double y, int z) {
//            System.out.println("더블 더블 정수 메소드 호출");
//            return x + y + z;

        // 매개변수의 개수가 다르기 때문에 오버로딩 성립함
//        static int sum(int x, int y, int z, int zz) {
//            System.out.println("더블 더블 정수 메소드 호출");
//            return x + y + z + zz;


    }
    static String sum(String x, String y, String z) {
        System.out.println("문자열 문자열 문자열 메소드 호출");
        return  x + y + z;
    }
}
