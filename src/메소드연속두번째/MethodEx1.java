package 메소드연속두번째;
// 메소드 호출 연습과 재귀 호출
public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println(whileSum(10)); // MethodEx1.whileSum() 인데 같은 클래스이기 때문에 MethodEx1 생략 가능
        System.out.println(forSum(10));
        System.out.println(gausSum(10));
        System.out.println(recuSum(10));
    }
    // 클래스 메소드이다.
    public static int whileSum(int n) {
        int sum = 0;
        while(true) {
            sum += n;
            n--;
            if(n == 0) break;
        }
        return sum;
    }
    public static int forSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int gausSum(int n) {
        return n * (n + 1) / 2;
    }
    public static int recuSum(int n) { // 보틍은 메인을 통해서 호출하는데 자기 자신을 호출(재귀 호출)
        if(n == 0) return 0;
        return n + recuSum(n - 1);
    }
}

