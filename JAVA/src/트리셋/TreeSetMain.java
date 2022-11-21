package 트리셋;
// TreeSet : 값이 추가될 때 자동 정렬이 이루어지면 검색 기능이 강화된 자료 구조임
// 이진 검색 트리이며 데이터 추가/제거의 기본 동자이 매우 빠릅니다.
// 좌/우, 노드를 참조하기 위한 두개의 참조 변수로 구성됨

import java.util.Iterator;
import java.util.TreeSet;

// 트리의 순회 방법 : 전위 중위 후위 (강사님 노션 참고!! 알고리즘->이진트리)
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30); // 값추가 시 자동으로 정렬됨
        ts.add(40);
        ts.add(20);
        ts.add(10);
        ts.add(45);
        // 향상된 for 문
        for(Integer e : ts) System.out.print(e + " ");
        ts.remove(40); // 값 삭제
        System.out.println(ts.size()); // 노드의 개수
        System.out.println(ts.subSet(10, 31)); // 부분 집합을 나타냄(10 ~ 31 미만)




//
//        for(Integer e : ts) System.out.print(e + " ");
//        System.out.println();
//
//
//        // Iterator() 사용
//        Iterator<Integer> iterator = ts.iterator();
//        System.out.print("1번 반복자 : ");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//
//        }
//        System.out.println();
//        Iterator<Integer> iterator2 = ts.iterator();
//        System.out.print("2번 반복자 : ");
//        while (iterator2.hasNext()) {
//            System.out.print(iterator2.next() + " ");
//
//        }

    }
}
