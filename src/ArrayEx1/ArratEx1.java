package ArrayEx1;

import java.util.Arrays;

public class ArratEx1 {
    public static void main(String[] args) {
        //int[] = new  int[4];
//        int[] score = new int[3]; // score 이름으로 3개의 정수 타입 배열을 생성
//        score[0] = 88;
//        score[1] = 70;
//        score[2] = 66;
//        for(int i=0; i< score.length; i++) { // 0번부터 배열의 길이보다 1 적을때까지 돌린다.
//            System.out.print(score[i] + " ");


//        int[] score = {89, 99, 100, 77};
//        for(int i=0; i< score.length; i++) { // 0번부터 배열의 길이보다 1 적을때까지 돌린다.
//            System.out.print(score[i] + " ");


//            int[] score = {89, 99, 100, 77};
//            int sum = 0;
//            for(int i=0; i< score.length; i++) { // 0번부터 배열의 길이보다 1 적을때까지 돌린다.
//                System.out.print(score[i] + " ");
//                sum += score[i]; // sum = sum + score[i]
//            }
//            System.out.println();
//            System.out.println("총점 : " + sum);


//        int[] score = {89, 99, 100, 77};
//        int sum = 0;
//        // 향상된 for문 : 자동으로 요소의 처음부터 끝까지 순회(원하는 위치부터 순회 불가)
//        // 바뀐 상태를 유지하지는 못함, 예를 들어 e += 100; 넣으면 처음에는 100이 더해지는 듯 보이지만 또 돌려보면 안더해져있음
//        for(int e : score) { // e: 요소값이라는 뜻으로 넣음, 변수 이름이라 다른 거 넣어도 됨
//            System.out.print(e + " ");
//            sum += e;
//        }
//        System.out.println();
//        System.out.println("총점 : " + sum);

//        int[] score = {89, 99, 100, 77};
//        int sum = 0;
//        for(int e : score) sum += e; // e 넣어도 되고 val 넣어도 되고 변수이름이라 다른 것 넣어도 됨
//        System.out.println("총점 : " + sum);
//        System.out.printf("평균 : %.2f\n", (double)sum/score.length);


//          int[] score = {89, 99, 100, 77};
//          int sum = 0;
//          for(int e : score) sum += e; // e 넣어도 되고 val 넣어도 되고 변수이름이라 다른 것 넣어도 됨
//          System.out.println(Arrays.toString(score));
//          System.out.println("총점 : " + sum);
//          System.out.printf("평균 : %.2f\n", (double)sum/score.length);

        // 배열의 다양한 초기화 방법

//        int[] score1 = {88, 99, 56}; // 배열의 초기값이 정해져 있는 경우는 new 키워드로 메모리 할당할 필요가 없음
//        int[] score2 = new int[] {77, 78, 88};
//        int[] score3;
//        score3 = new int[] {44, 55, 66};
//        int[] score4 = new int[3];
//        score4[0] = 22;
//        score4[1] = 88;
//        score4[2] = 78;


        // 다양한 데이터 타입에 대한 배열 선언

//        int[] odds = {1,3,5,7,9,11};
//        String[] weeks = {"월요일", "화요일", "수요일", "목요일", "금요일"};
//        char[] test = {'A', 'B', 'C', 'D'};

//        String[] weeks = new String[7];
//        weeks[0] = "월요일";
//        weeks[1] = "화요일";
//        weeks[2] = "수요일";
//        weeks[3] = "목요일";
//        weeks[4] = "금요일";
//        weeks[5] = "토요일";
//        weeks[6] = "일요일";
//        for(int i = 0; i < weeks.length; i++) {
//            System.out.print(weeks[i] + " ");
//        }
//        System.out.println();


        String[] weeks = new String[7];
        weeks[0] = "월요일";
        weeks[1] = "화요일";
        weeks[2] = "수요일";
        weeks[3] = "목요일";
        weeks[4] = "금요일";
        weeks[5] = "토요일";
        weeks[6] = "일요일";
        System.out.print("[");
        for(int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + ", ");
        }
        System.out.printf("\b\b]"); // 백스페이스 사용하여 두칸 지우면 , 없어짐
        System.out.println();

        System.out.println(Arrays.toString(weeks)); // 배열 클래스의 메소드를 이용해서 출력

        System.out.print("[");
        for(String e : weeks) System.out.print(e + ", ");
        System.out.printf("\b\b]");
        System.out.println();

    }
}
