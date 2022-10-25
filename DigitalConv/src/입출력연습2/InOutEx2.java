package 입출력연습2;
import java.util.Scanner;
// Scanner 클래스 : 표준 입력 클래스, java.util 패키지에 있음
// 클래스 이름 참조자 이름(객체 이름) = new 클래스 이름(System.in);
public class InOutEx2 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //byte a = sc.nextByte(); // -128 ~ 127
        //short b = sc.nextShort();
        //int c = sc.nextInt();
        //long d = sc.nextLong();
        //char ch = sc.next().charAt(0); // 문자열을 입력받아서 첫번째 문자를 추출
        //float e = sc.nextFloat();
        //double f = sc.nextDouble();
        //boolean g = sc.nextBoolean();
        //String h = sc.next(); // 문자열을 입력 받는데 공백이 오면 그만 입력 받음(공백 앞까지만 입력 받음)
        //String i = sc.nextLine(); // 줄바꿈(개행문자)이 오기 전까지 입력 받음

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); // 문자열을 입력 받음(공백이 오면 중단됨)
         sc.nextLine(); // 버퍼 지워주기
         System.out.print("주소를 입력 하세요 : ");
         String addr = sc.nextLine();
         System.out.print("성별을 입력 하세요 : ");
         char gender = sc.next().charAt(0); // 문자열 중에서 0번째 인덱스의 값을 가져옴
         System.out.print("나이를 입력 하세요 : ");
         int age = sc.nextInt();
         String isPrint = sc.next();
         if(isPrint.equalsIgnoreCase("yes")) { // equalsIgnoreCase : 대소문자 안가림
             System.out.print("회원 정보를 출력 하시겠습니까?[yes/no] : ");
             System.out.println("======== 회원 정보========");
             System.out.println("이름 : " + name);
             System.out.println("주소 : " + addr);
             System.out.println("성별 : " + gender);
             System.out.println("나이 : " + age);
         } else {
             System.out.println("출력 안함");
         }
    }
}
