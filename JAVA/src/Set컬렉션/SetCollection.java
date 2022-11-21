package Set컬렉션;
// HashSet : 순서를 유지해주지 않고, 중복 허용을 하지 않음
// 집합의 기능 사용 : 교집합, 합집합, 차집합
// 합집합 : 양쪽에 있는 모든 요소를 포함함(중복 허용하지 않음)
// 교집합 : 양쪽 모두에 존재하는 요소만 포함(다만 중복은 허용하지 않음)
// 차집합 : 앞의 집합에서 뒤의 집합을 뺌(?)
import java.util.Arrays;
import java.util.HashSet;
public class SetCollection {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        while(true) {
//            int val = (int)(Math.random() * 45) + 1;
//            set.add(val); // set은 중복된 값을 허용하지 않음
//            if(set.size() == 6) break;
//        }
//        System.out.println(set); // 로또 번호 만들 때(중복되는 번호 없어야하니까..)

//        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
//        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        //s1.addAll(s2); // 합집합 수행
//        //s1.retainAll(s2); // 교집합
//        s1.removeAll(s2); // 차집합
//        System.out.println(s1);

        HashSet<String> set = new HashSet<>();
        set.add("Java"); // 값 추가하기
        set.add("Python");
        set.add("Kotlin");
        set.addAll(Arrays.asList("JavaScript", "C++", "C#")); // 여러개의 값 한번에 추가하기
        set.remove("C#");
        set.removeAll(Arrays.asList("JavaScript", "C++", "C#")); // 여러개를 한번에 삭제
        System.out.println(set);
    }
}
