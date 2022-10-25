package 전자레인지;
// 3개의 타이머 : 5분(300), 1분(60), 10초
// 정확한 시간을 맞출 수 없으면 -1 (즉, 10보다 작은 수)

import java.util.Scanner;
public class TimeMainEx1 {
    public static void main(String[] args) {
        int a , b, c;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300;
            b = t % 300 / 60;
            c = t % 300 % 60 / 10;
            System.out.print(a + " " + b + " "+ c);
        }

    }
}
