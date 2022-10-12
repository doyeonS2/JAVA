package 시스템클래스;
import java.util.Scanner;

import static java.lang.Thread.sleep;

// 현재 시간 읽기 : System.currentTimeMillis(); // 1000/1초
// 현재 시간 읽기 : System.nanoTime() // 1000000/1초
public class SystemMain {
    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        System.gc();
//        while (true) {
//            String input = sc.next();
//            if (input.equals("quit")) {
//                System.out.println("시스템을 강제 종료합니다.");
//                System.exit(0); // 현 위치에서 프로그램이 종료됨
//            }
//            System.out.println("입력값은 " + input + "입니다.");
//        }

//        long time = System.currentTimeMillis();
//        long timeNano = System.nanoTime();
//        System.out.println(time);
//        System.out.println(timeNano);

        int[] data = new int[1000];
        int cnt = 0; // 총 검색 횟수
        int randVal = (int) (Math.random() * 1000) + 1;
        for(int i = 0; i < 1000; i++) {
            data[i] = i + 1;
        }
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            cnt++;
            sleep(1);
            if(randVal == data[i]) {
                System.out.println("찾은 위치 : " + (i+1));
                break;
            }
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("총 검색 시간 : " + (timeEnd - timeStart) + "밀리초 입니다.");

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));

    }
}
