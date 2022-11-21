package 어레이홀짝;
import java.util.*;

// 1. 정수를 입력받음 (999가 들어오면 입력 중지)
// 2. 어레이리스트에 홀수/짝수 나누어담기
// 3. 홀수/짝수 어레이리스트 출력하기
public class ArrayMethod {
//    List<Integer> inList = new ArrayList<>();
//    List<Integer> oddList = new ArrayList<>();
//    List<Integer> evenList = new ArrayList<>();

//    List<Integer> inList = new LinkedList<>();
//    List<Integer> oddList = new LinkedList<>();
//    List<Integer> evenList = new LinkedList<>();

    List<Integer> inList = new Vector<>();
    List<Integer> oddList = new Vector<>();
    List<Integer> evenList = new Vector<>();
    // 정수값 입력 받는 메소드
    void inputValue() {
        int tmp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        while (true) {
            tmp = sc.nextInt();
            if(tmp == 999) break;
            inList.add(tmp);

        }
    }
    void calcMethod() {
        for(Integer e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printMethod() {
        System.out.print("홀수 : ");
        for(Integer e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.println("짝수 : ");
        for(Integer e : evenList) System.out.print(e + " ");
        System.out.println();
    }
}
