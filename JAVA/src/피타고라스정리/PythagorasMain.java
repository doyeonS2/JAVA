package 피타고라스정리;

import java.util.Arrays;
import java.util.Scanner;

// 피타고라스 정리 : 직각삼각형에서 빗변을 제외한 나머지 두 변의 길이를 제곱해
public class PythagorasMain {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[2] * arr[2] == (arr[0] * arr[0] + arr[1] * arr[1])) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
