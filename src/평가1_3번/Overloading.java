package 평가1_3번;
// 메소드 오버로딩 : 동일한 메소드 이름으로 매개변수의 타입이나 갯수에 따라 다양하게 호출
// 즉, 동일한 이름의 메소드가 여러개 존재함을 의미함
// 매개변수나 타입이 같고 반환값만 다른 경우는 성립하지 않는다.
//public class Overloading {
//    public void test() {}
//    public void test(String str) {}
//    public void test(int i) {} // 타입이 다르기 때문에 가능
//
//    public void test(String s) {} // 매개변수의 갯수와 타입이 같아서 안됨
//    // 2번과 4번이 오류난다!! 같은 스트링 타입에 갯수도 같아서!! (1번 문제)
//
//
//    public void test(char ch) {}
//    public void test(String str, int i) {}
//    public void test(int i, String str) {} // 이건 가능함, 매개변수의 순서가 있음
//    private void test(int i) {} // 이미 동일한 갯수와 타입이 있음
//    public int test() {return 0;} // 매개변수가 같아서 안됨
//}
