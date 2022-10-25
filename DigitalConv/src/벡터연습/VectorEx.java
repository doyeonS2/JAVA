package 벡터연습;
import java.util.List;
import java.util.Vector;

// Vector는 ArrayList와 동일한 내부 구조를 가지고 있습니다. (사용 방법도 동일)
// 차이점은 멀티쓰레드 환경에 대한 동기화 지원 여부에 따라 다릅니다. (Vector는 동기화 지원)
// 성능은 ArrayList가 우수합니다.
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "yyy@gmail.com", "010-1234-5678", "변호사"));
        list.add(new NameCard("동그라미", "ddd@gmail.com", "010-2345-5678", "친구"));
        list.add(new NameCard("이준호", "ljh@gmail.com", "010-1234-6789", "회사원"));
        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}
