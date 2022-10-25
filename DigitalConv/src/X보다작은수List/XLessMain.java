package X보다작은수List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 정수 N과 X가 주어지고 N개의 배열 생성 후 배열에서 X보다 작은 수 찾아서 출력
public class XLessMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 리스트 입력 받은 값 추가
            if(list.get(i) < x) System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
