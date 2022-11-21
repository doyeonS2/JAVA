package 큐연습2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 명령어 이력을 관리하는 큐 만들기
public class QueueMainEx2 {
    static Queue<String> queue = new LinkedList<>();
    static final int MAX_SIZE = 5; // 상수로 정의
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true) { // "q/Q" 문자가 들어올 때까지 계속 반복 수행
            System.out.print(">>"); // 터미널에서 입력 화면처럼 보여주기위해 만듦
            Scanner sc = new Scanner(System.in);
            String in = sc.nextLine().trim(); // 입력받은 문자열에서 앞/뒤의 공백을 지워줌
            if(in.equalsIgnoreCase("q")) {
                System.exit(0); // 강제 종료 시킴, System Call
                // equalsIgnoreCase() : 문자열 비교 시 대소문자 구분하지 않음
            } else if(in.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여줍니다.");
                System.out.println("q/Q - 프로그램을 종료합니다.");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
            } else if(in.equalsIgnoreCase("history")) {
                save(in); // 입력 받은 문자열을 queue에 저장하는 메소드

//                LinkedList list = (LinkedList) queue;
//                for(int i = 0; i < list.size(); i++) {
//                    System.out.println((i+1) + "." + list.get(i));
//                }

                int cnt = 0;
                for(String e : queue) {
                    cnt++; // 명령 history앞에 숫자를 붙여주기 위해서 만든 변수
                    System.out.println(cnt + "." + e);
                  }
                } else {
                    save(in);
                    System.out.println(in);
                }
            }
        }
        static void save(String in) {
            queue.offer(in);
            // remove() : 큐의 맨 앞에 있는 요소를 제거함
            if (queue.size() > MAX_SIZE) queue.remove();
    }
}
