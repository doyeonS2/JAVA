package 피타고라스혼자풀기;
import java.util.Arrays;
import java.util.Scanner;
public class PythagorasEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] n = new int[3];
            for(int i=0 ; i<3 ; i++) {
                n[i] = sc.nextInt();
            }

            if (n[0] == 0 && n[1] == 0 && n[2] == 0) break;

            Arrays.sort(n);

            if( (n[0] * n[0]) + (n[1] * n[1]) == (n[2] * n[2]))
                System.out.println("right");
            else System.out.println("wrong");
        }
    }
}


// 틀림
// 순서 바꿔서 입력해도 답이 나와야 함

// ctrl + R