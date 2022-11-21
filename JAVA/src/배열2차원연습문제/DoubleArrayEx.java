package 배열2차원연습문제;
// 2차원 배열 성적 구하기 및 오름차순 정렬
public class DoubleArrayEx {
    public static void main(String[] args) {
        double[] avr = {0,0,0,0,0,0};
        int[][] student = {
                {1, 66, 77, 89, 0}, // 학번, 국어, 수학, 영어, 총점
                {2, 80, 88, 98, 0},
                {3, 100, 48, 33, 0},
                {4, 87, 98, 23, 0},
                {5, 100, 99, 98, 0},
                {6, 67, 98, 98, 0}
        };
        for(int i = 0; i < student.length; i++) { // 행 : 6
            for(int j = 1;  j < 4; j++) { // 총점 : 1 ~ 3만 계산
                student[i][4] += student[i][j];
            }
            avr[i] = (double) student[i][4]/3;
            System.out.printf("%d, %d, %.2f\n", student[i][0], student[i][4], avr[i]); // 학번, 총점, 평균
        }
        int tmp_num = 0;
        int tmp_total = 0;
        double tmp_avr = 0.0;
        System.out.println("학번\t 총점\t 평균");
        System.out.println("--------------------------");
        for(int i = 0; i < student.length; i++){
            for(int j = i; j < student.length; j++) {
                if(student[i][4] < student[j][4]) {
                    tmp_total = student[i][4];
                    student[i][4] = student[j][4];
                    student[j][4] = tmp_total;

                    tmp_num = student[i][0];
                    student[i][0] = student[j][0];
                    student[j][0] = tmp_num;

                    tmp_avr = avr[i];
                    avr[i] = avr[j];
                    avr[j] = tmp_avr;
                }
            }
            System.out.printf("%d, %d, %.2f\n", student[i][0], student[i][4], avr[i]);
        }
    }
}
