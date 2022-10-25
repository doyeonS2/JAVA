package X보다작은수;

import java.util.Scanner;

// 배열의 갯수와 기준값을 입력받음, 10(배열의 갯수) 5(기준값)
// 입력된 기준 수보다 작은 수를 모두 출력
// 입력 : 10 5
// 배열의 값 : 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4
public class XArrayEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 갯수 입력
        int x = sc.nextInt(); // 기준 값 입력
        int[] arr = new int[n]; // n의 갯수만큼 배열 생성
        // 반복문을 돌려서 배열에 값 입력받고 x보다 작은 수 출력
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < x) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
