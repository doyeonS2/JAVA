package 선택정렬;
import java.util.Arrays;
public class SelectionEx1 {
    public static void main(String[] args) {
        int[] arr = {9,4,3,10,5,8,7,6,2,1};
        int tmp = 0; // 값을 정렬할 때 임시로 사용되는 변수
        int min; // 제일 작은 값이 있는 위치에 대한 인덱스
        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
