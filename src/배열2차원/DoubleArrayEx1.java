package 배열2차원;

import java.util.Arrays;

// 2차원 배열 : 행과 열이 존재
public class DoubleArrayEx1 {
    public static void main(String[] args) {
//        int[][] arr = new int [2][3]; // arr -> 참조변수
//        int k = 10;
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = k;
//                k += 10;
//            }
//        }


        int[][] arr = {
                {100, 200, 300},
                {400, 500, 600}

        };
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));

//

        for (int[] ints : arr) {
            for (int e : ints) {
                System.out.print(e + " ");
            }


        }
    }
}
