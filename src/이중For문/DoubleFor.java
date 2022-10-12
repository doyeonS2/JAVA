package 이중For문;
// 입력 받은 수가 소수인지 아닌지 판별하기
// 소수란? 1과 자기자신 이외의 수로는 나누어지지 않는 수를 의미함
// 결과 : n은 소수 입니다. n은 소수가 아닙니다.
// 어드밴드 문제 : n의 수를 입력 받아서 범위 내의 소수의 합을 구하기 : 12 미만 (2 + 3 + 5 + 7 + 11)
import java.util.Scanner;
public class DoubleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 2; i < n; i++ ) {
            sum += funcPrime(i);
        }
        System.out.println("소수의 합 : " + sum);

    }
    static int funcPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false;

        }
        if(isPrime) return  n;
        else return 0;
    }
}
