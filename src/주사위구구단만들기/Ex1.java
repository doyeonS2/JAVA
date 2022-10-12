package 주사위구구단만들기;

public class Ex1 {
    public static void main(String[] args) {
//        // if문으로 주사위 만들기
//        int num = (int)(Math.random()*6)+1;
//        if(num==1){
//            System.out.println("1입니다.");
//        } else if(num==2){
//            System.out.println("2입니다.");
//        } else if(num==3){
//            System.out.println("3입니다.");
//        } else if(num==4){
//            System.out.println("4입니다.");
//        } else if(num==5){
//            System.out.println("5입니다.");
//        } else {
//            System.out.println("6입니다.");
//        }

//        // switch문으로 주사위 만들기
//        int num = (int)(Math.random()*6)+1;
//        switch(num){
//            case 1:
//                System.out.println("1입니다.");
//                break;
//            case 2:
//                System.out.println("2입니다.");
//                break;
//            case 3:
//                System.out.println("3입니다.");
//                break;
//            case 4:
//                System.out.println("4입니다.");
//                break;
//            case 5:
//                System.out.println("5입니다.");
//                break;
//            default:
//                System.out.println("6입니다.");
//                break;
//        }

//        // for문으로 구구단 만들기
//        int num = 0;
//        for(int i=2; i<9; i++) {
//            System.out.println("<"+i+"단>");
//            for(int j=1; j<9; j++){
//                System.out.println(i + "x" + j + "=" + i*j);
//            }
//            System.out.println("-------------------");
//        }

        // 6이 나오면 break문 종료
//        while (true) {
//            int num = (int) (Math.random() * 6) + 1;
//            System.out.println(num);
//            if (num == 6) {
//                break;
//            }
//        }
//        System.out.println("종료");

        // 특정 조건 For문(continue 사용)
        for(int i=1; i<10; i++){
            if(i%2 != 0){ // 홀수는 실행하지 않고 반복
                continue;
            }
            System.out.println(i); // 짝수만 실행
        }
    }
}