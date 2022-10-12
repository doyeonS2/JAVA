package 콘솔입출력;
import java.io.IOException;
import java.io.OutputStream;
// 키보드 입력을 받고 화면에 출력하는것
// System.in, System.out, System.err
// System.in 필드 : 콘솔로부터 데이터를 입력 받는 정적 필드, InputStream과 사용 가능
// System.out 필드 : 콘솔로 데이터를 출력하기 위해 사용
public class ConsoleInOutMain {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        for(byte b = 48; b < 58; b++) {
            os.write(b);
        }
        os.write(10);
        for(byte b = 65; b < 65+26; b++) {
            os.write(b);
        }
        os.write(10);
        String hangul = "가나다라마바사아자차카타파하";
        // getBytes() : 유니코드를 바이트코드로 인코딩해주는 메소드
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);
        os.flush();

//        System.out.println("=== 메뉴 ===");
//        System.out.println("1. 예금 조회");
//        System.out.println("2. 예금 출금");
//        System.out.println("3. 예금 입금");
//        System.out.println("4. 종료 하기");
//        InputStream is = System.in;
//        char inputChar = (char) is.read(); // ASCII를 읽어 문자로 반환
//        switch (inputChar) {
//            case '1' :
//                System.out.println("예금 조회를 선택 하셨습니다.");
//                break;
//            case '2' :
//                System.out.println("예금 출금을 선택 하셨습니다.");
//                break;
//            case '3' :
//                System.out.println("예금 입금을 선택 하셨습니다.");
//                break;
//            case '4' :
//                System.out.println("종료 하기를 선택 하셨습니다.");
//                break;
//        }
    }
}
