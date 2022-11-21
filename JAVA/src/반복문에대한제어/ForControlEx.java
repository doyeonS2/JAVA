package 반복문에대한제어;
// break와 continue
public class ForControlEx {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) { // i가 0에서부터 100보다 작은 동안 반복
            if(i % 2 == 0) continue; // 아래의 문장을 수행하지 않고 반복문으로 되돌아감
            if(i == 67) break;
            System.out.println(i);
        }
    }
}
