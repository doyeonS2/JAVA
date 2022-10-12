package 어레이리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 배열의 확장판, 자바에서 리스트 구조의 컬렉션 프레임워크의 기본 자료 구조
public class ArrayListMain {
    public static void main(String[] args) {
        String[] data = {"161", "111", "133", "124", "138", "145", "155"};
        // Array.asList(배열) : 이미 만들어져 있는 배열로 ArrayList를 만듦
        List<String> pitches = new ArrayList<>(Arrays.asList(data));
        // 리스트 정렬하기, 오름차순 : Comparator.naturalOrder()
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
        // 리스트 정렬하기, 내림차순 : Comparator.reverseOrder()
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);




//         // join() : 구분자를 이용해 문자열을 만들어줌
//        String result = String.join("@@", pitches);
//        System.out.println(result);



//        List<String> pitches = new ArrayList<>();
//        // 리스트에 값을 추가
//        pitches.add("127"); // ArrayList에 값을 추가
//        pitches.add("142");
//        pitches.add("155");
//        // 리스트의 해당 인덱스에 값을 삽입
//        pitches.add(0, "130");
//        // 특정 위치의 값을 가져올 때 get(인덱스)
//        System.out.println(pitches.get(1));
//        // 리스트의 사이즈 확인
//        System.out.println(pitches.size());
//        // 리스트 내에 해당 항목이 있는지 확인 (결과는 참/거짓), contains(확인하고자하는 값)
//        System.out.println(pitches.contains("142"));
//        // 해당 인덱스의 항목을 삭제, remove(인덱스), 삭제되는 결과를 반환해 줌
//        System.out.println(pitches.remove(0));
//
//        String val1 = pitches.get(0); // 해당 인덱스의 값을 변수에 저장

    }
}
