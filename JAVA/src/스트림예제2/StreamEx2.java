package 스트림예제2;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
// 스트림은 컬렉션의 요소에 대해 중간 처리와 최종 처리를 수행할 수 있는데,
// 중간 처리에서는 매핑, 필터링, 정렬을 수행하고 최종 처리에서는 반복, 카운팅, 평균, 총합 등의 처리를 수행
public class StreamEx2 {
    public static void main(String[] args) {
        List<StudentInfo> list = new LinkedList<>();
        list.add(new StudentInfo("미미", 45));
        list.add(new StudentInfo("안유진", 98));
        list.add(new StudentInfo("이영지", 88));
        list.add(new StudentInfo("이은지", 90));
        list.add(new StudentInfo("나영석", 91));
        // 중간 스트림 만들기
        double avg = list.stream()
                .mapToDouble(StudentInfo::getScore) // 메소드 참조
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);


//        // 순차 처리
//        Stream<StudentInfo> stream = list.stream();
//        stream.forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            print(String.format(name + ", " + score));
//        });

//        // 병렬 처리
//        Stream<StudentInfo> parallelStream = list.parallelStream();
//        parallelStream.forEach(s-> {
//            String name = s.getName();
//            int score = s.getScore();
//            print(String.format(name + ", " + score));
//
//        });
//    }
//
//    static void print(String str) {
//        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}

//        Stream<StudentInfo> stream = list.stream();
//        stream.forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + ", " + score);
//        });
//        for(StudentInfo e : list) {
//            String name = e.getName();
//            int score = e.getScore();
//            System.out.println(name + ", " + score);
//        }


class StudentInfo {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;

    }
}
