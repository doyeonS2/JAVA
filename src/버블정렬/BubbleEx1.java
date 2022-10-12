package 버블정렬;

import java.util.Arrays;

// 버블정렬은 배열의 각 요소의 현재 위치와 다음 위치의 요소를 각각 다 비교
public class BubbleEx1 {
    public static void main(String[] args) {
        int[] arr = {9,4,3,10,5,8,77,6,23,1};
        int tmp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) { // i = j
                // 오름차순으로 정렬됨, 내림차순으로 하고 싶으면 arr[i] < arr[j]로 부호만 바꾸면 됨
                if (arr[i] > arr[j]) { // i > j가 성립하지 않아서 두번째 for 다시!
                    tmp = arr[j];
                    arr[j] = arr [i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
