package 자바종합실습1번;
// 클래스 정렬을 위해 Comparable 사용
// 성적이 높은 사람 순으로 이름과 총점 표시
public class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    int tot;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    int getTotal() {
        return kor + eng + mat;

    }
    String getName() {
        return name;
    }

    @Override
    // 여기서 정렬 기준에 대한 조건을 만듦 (총점이 높은 사람이 먼저 나오도록 - 내림차순)
    // ComparaTo() : 정수형 값이 반환되고 반환 값이 1인 경우 정렬 조건이 성립된다.
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) {
            return name.compareTo(o.name); // 성적이 같은 경우 이름의 사전순 정렬
        }
        else if(this.getTotal() > o.getTotal()) return -1;
        else return 1; // 자신의 객체의 총점보다 매개변수로 입력된 객체의 총점이 큰 경우

    }
}
