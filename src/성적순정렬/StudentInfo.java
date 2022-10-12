package 성적순정렬;
import org.jetbrains.annotations.NotNull;
// 이름과 성적에 대한 인스턴스 필드 생성
// 검색을 위한 Comparable 인터페이스 상속을 받아서 구현(클래스에 대한 정렬 기준을 정함)
// 인터페이스 상속은 반드시 메소드를 구현해줘야함
public class StudentInfo implements Comparable<StudentInfo> {
    public String name; // 학생의 이름
    public int score; // 학생의 성적


    // 생성자 만들기 : 인스턴스 필드에 초기값을 넣어줌줌
   public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
//        if(this.score == o.score) return 0; // 정렬 조건이 아님
//        else if(this.score > o.score) return -1;// 내림차순 조건이 아님, 정렬 안함
//        else return 1; // 정렬 조건이 됨, 즉 뒤에 값을 swap (위치를 바꿈)
        if(this.name.compareTo(o.name) == 0) return 0;
        else if(this.name.compareTo(o.name) < 0) return -1;
        else return 1;
    }
}
