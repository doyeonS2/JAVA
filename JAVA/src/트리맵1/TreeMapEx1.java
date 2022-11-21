package 트리맵1;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// TreeMap 이란 ? 이진트리 기반의 Map 컬렉션입니다.
// TreeSet과 차이점은 키와 값이 저장된 Map.Entry를 저장합니다.
// TreeMap의 기본 동작은 부모키 값과 비교해 작은 것은 왼쪽, 큰 것은 오른쪽에 저장
// Map 인터페이스 타입 변수에 대입되지만 TreeMap 클래스 타입으로 대입하는 이유는
// 특정 객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위함
public class TreeMapEx1 {
    public static void main(String[] args) {
        //Map<Integer, String> score = new TreeMap<>(); // 트리맵에서 선언된 메소드 사용못함
        TreeMap<Integer, String> score = new TreeMap<>(); // 그래서 트리맵으로 대입..ㅎ..
        score.put(55, "나희도");
        score.put(50, "고유림");
        score.put(98, "백이진");
        score.put(76, "구자경");
        score.put(99, "우영우");

        System.out.println(score);

        // 반환 타입이 Map
        NavigableMap<Integer, String> descMap = score.descendingMap();
        // 반환 타입이 Set
        Set<Map.Entry<Integer, String>> descEntrySet = descMap.entrySet();
        for(Map.Entry<Integer, String> entry : descEntrySet) {
            System.out.print(entry.getKey()+ "=" + entry.getValue() + " ");
        }
        // Map의 값을 전체 출력하기 위해서는 entrySet()이나 ketSet()메소드를 사용하면 됨
        // entrySet() : Key와 value의 값이 모두 필요한 경우 사용
        // ketSet() : Key의 값만 필요한 경우 사용
        System.out.println();

//        // firstEntry() : 제일 낮은 Map.Entry를 리턴
//        System.out.println("가장 낮은 점수 : " +
//                score.firstEntry().getKey() + ", " +
//                score.firstEntry().getValue());
//
//        // lastEntry() : 제일 높은 Map.Entry를 리턴
//        System.out.println("가장 높은 점수 : " +
//                score.lastEntry().getKey() + ", " +
//                score.lastEntry().getValue());
//
//        System.out.println("90점 위의 점수 : " +
//                score.higherEntry(90).getKey() + ", " +
//                score.higherEntry(90).getValue());
//
//        System.out.println("90점 아래의 점수 : " +
//                score.lowerEntry(90).getKey() + ", " +
//                score.lowerEntry(90).getValue());
//
//        System.out.println("97점 이거나 바로 아래 점수 : " +
//                score.floorEntry(97).getKey() + ", " +
//                score.floorEntry(97).getValue());
//
//        System.out.println("95점 이거나 바로 위의 점수 : " +
//                score.ceilingEntry(95).getKey() + ", " +
//                score.ceilingEntry(95).getValue());
//
//        // pollFirstEntry() : 제일 낮은 Map.Entry를 꺼내오고 컬렉션 제거
//        while (!score.isEmpty()) {
//            Map.Entry<Integer, String> entry = score.pollFirstEntry();
//            System.out.println("값을 꺼내오고 지움 : " +
//                    entry.getKey() + ", " + entry.getValue());
//        }


    }
}
