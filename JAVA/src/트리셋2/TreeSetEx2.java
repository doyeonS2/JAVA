package 트리셋2;
import java.util.Scanner;
import java.util.TreeSet;
// 5명의 성적을 입력받아 TreeSet에 저장
// 합격 기준 점수를 60점으로 정함
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("성적 입력 : ");
        for (int i = 0; i < 5; i++) {
            treeSet.add(sc.nextInt());
        }
        // headSet() : 지정된 요소보다 작은 값의 객체들을 반환
        System.out.println("60점 미만 : " + treeSet.headSet(60));
        // tailSet() : 지정된 요소보다 큰 값의 객체들을 반환
        System.out.println("60점 이상 : " + treeSet.tailSet(60));
        // 주어진 점수 바로 아래 점수 출력
        System.out.println("60점 바로 아래 점수 : " + treeSet.lower(60));
        // 주어진 점수 바로 위의 점수 출력
        System.out.println("60점 바로 위의 점수 : " + treeSet.higher(60));
        // 정렬된 순서에서 첫번째 객체 반환
        System.out.println("첫번째 객체 : " + treeSet.first());
        // 정렬된 순서의 마지막 객체 반환
        System.out.println("마지막 객체 : " + treeSet.last());

    }
}
