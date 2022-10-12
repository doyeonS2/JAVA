package 스트링버퍼;
// StringBuffer() : 문자열을 추가하거나 변경할 때 사용
public class StringBufferMain {
    public static void main(String[] args) {
        // StringBuffer :  멀티 쓰레드
//        StringBuffer sb = new StringBuffer(); // mutable(값을 변경할 수 있다)
//        sb.append("hello");
//        sb.append(" ");
//        sb.append("Java");
//        sb.append("^^");
//        System.out.println(sb);

//        String buff = ""; // immutable(값을 변경할 수 없는 것)
//        buff = "hello";
//        buff += " ";
//        buff += "Java";
//        buff += "^^";
//        System.out.println(buff);

        // StringBuilder : 성능이 우수하지만 싱글 쓰레드용
          StringBuilder sb = new StringBuilder(); // mutable(값을 변경할 수 있다)
          sb.append("hello");
          sb.append("Java");
          sb.append("^^");
        // delete(시작 인덱스, 끝 인덱스) : 전달된 인덱스의 문자열을 제거
          sb.delete(0, 5); // 시작 인덱스에서 끝 인덱스 미만까지 삭제( 0 ~ 4까지 삭제)
        // insert(인덱스, "추가할 문자열") : 문자열 삽입
          sb.insert(0,"Hi^^");
          System.out.println(sb);
        // substring
          System.out.println(sb.substring(0,8)); // 문자열 자르기







    }
}
