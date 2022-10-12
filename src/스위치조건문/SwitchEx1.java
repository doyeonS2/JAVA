package 스위치조건문;
import java.util.Scanner;

// switch(변수) { case : }
// 스위치문으로 계산기 만들기
public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("계산식을 입력하세요. : ");
        //int a = sc.nextInt();
        //char op = sc.next().charAt(0); // 연산자
        //int b = sc.nextInt();
        //switch(op) {
            //case '+' : // 각 케이스는 : 을 사용
                //System.out.printf("덧셈 : %d\n", a + b);
               // break;
           // case '-' :
           //     System.out.printf("뺄셈 : %d\n", a - b);
            //    break;
          //  case '*' :
          //      System.out.printf("곱셈 : %d\n", a * b);
          //      break;
         //   case '/' :
         //       System.out.printf("나눗셈 : %d\n", a / b);
          //      break;
          //  default :
            //    System.out.printf("해당 연산자는 없습니다.\n");

        while(true) {
            System.out.print("성별을 입력하세요. : ");
            char gender = sc.next().charAt(0);
            switch (gender) {
                case 'M' :
                case 'm' :
                    System.out.println("남성 입니다.");
                    break;
                case 'F' :
                case 'f' :
                    System.out.println("여성 입니다.");
                    break;
                default:
                    System.out.println("성별을 잘못 입력하셨습니다. 다시 입력하세요.");
                continue;
        }
        break;



        }

    }
}
