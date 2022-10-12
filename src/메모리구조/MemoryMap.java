package 메모리구조;
public class MemoryMap {
    public static void main(String[] args) {
        String strVal1 = "나희도"; // 참조 변수: 대문자로 시작 (String)
        String strVal2 = "나희도";
        String strVal3 = new String("나희도");
        if (strVal1 == strVal3) {
            System.out.println("str1Val1과 strVal3는 참조가 같음");
        } else {
            System.out.println("str1Val1과 strVal3는 참조가 다름");
        }
        if (strVal1.equals(strVal3)) {
            System.out.println("str1Val1과 strVal3는 값이 같음");

        }

    }
}
