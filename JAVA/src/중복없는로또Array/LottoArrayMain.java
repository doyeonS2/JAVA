package 중복없는로또Array;
import java.util.ArrayList;
import java.util.List;
// ArrayList로 중복없는 로또 번호 만들기
// contains() : 리스트안에 해당 값이 있는지 확인
public class LottoArrayMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int tmp = 0;
        while (true) { // 로또번호가 중복되는 횟수를 알 수 없기 때문에..
            // 0 ~ 44 까지 45개의 값 생성 후 1을 더해서 (1 ~ 45까지의 값을 만듦)
            tmp = (int)((Math.random() * 45) + 1);
            // contains(값) : 해당 값이 리스트에 포함되어 있는지 확인
            if(!list.contains(tmp) == false) { // tmp가 리스트에 포함되어 있지 않으면
                list.add(tmp);
            }
            // ArrayList 크기가 6이면 반복문을 끝냄
            if(list.size() == 6) break;
        }
        // 향상된 for문으로 결과 출력
        for(Integer e : list) System.out.print(e + " ");
    }
}


