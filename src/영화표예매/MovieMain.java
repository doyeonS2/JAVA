package 영화표예매;
import java.util.Scanner;
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(12000); // 기본 생성자 호출
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selectMenu = sc.nextInt();
            if(selectMenu == 1) ticket.selcetSeat();
            else {
                System.out.println(ticket.totalAmount());
                break;
            }
        }
    }
}
