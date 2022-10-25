package 스트림중개연산;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 스트림 중개 연산은 스트림을 전달받아 중개 연산을 연속해서 사용
// 필터링 : filter(), distinct()
// 변환 : map(), flatMap()
// 제한 : limit(), skip()
// 정렬 : sorted()
public class StreamMiddleEx {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
//        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        // distinct() : 스트림의 중복 요소 제거하는 중간 단계 스트림
//        stream1.distinct().forEach(e-> System.out.print(e + " "));
//        System.out.println();
        // filter() : 조건을 통해 원하는 것만 골라내는 중간 단계 스트림
//        stream2.filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
//        System.out.println();
        // map() : 해당 스트림의 요소들을 주어진 함수에 인수로 전달하여 그 값으로 새로운 스트림 반환함
//        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        // stream.map(s->s.length()).forEach(System.out::println);
//        stream.map(s->s.length()).forEach(e->System.out.print(e + " "));
        // limit() : 첫번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로은 스트림 반환
        // skip() : 첫번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 새로운 스트림 반환
        IntStream stream3 = IntStream.range(0, 10); // 0 ~ 10 미만까지
        IntStream stream4 = IntStream.range(0, 10); // 0 ~ 10 미만까지
        IntStream stream5 = IntStream.range(0, 10); // 0 ~ 10 미만까지
//        stream3.limit(5).forEach(s-> System.out.print(s + " "));
//        System.out.println();
//        stream4.skip(4).forEach(s->System.out.print(s + " ")); // 0 ~ 3 까지 제외
//        System.out.println();
//        stream5.skip(3).limit(5).forEach(s->System.out.print(s + " "));
        // 스트림 정렬 : 주어진 비교자(comparator)를 이용해 정렬
        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        stream1.sorted().forEach(s->System.out.print(s + " "));
        System.out.println();
        stream2.sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s + " "));
    }
}
