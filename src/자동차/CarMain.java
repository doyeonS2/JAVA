package 자동차;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        String[] place = {"","부산", "대전", "강릉", "광주"};
        String[] cars = {"","스포츠카", "승용차", "버스"};
        int[] distance = { 0,400,150,200,300};
        Scanner sc = new Scanner(System.in);
       // BasicCar basicCar = new BasicCar();
        Bus bus = new Bus();
        PassengerCar passengerCar = new PassengerCar();
        SportsCar sportsCar = new SportsCar();
        boolean isAddFunc = false;

        System.out.print("이동 지역을 선택하세요 (1:부산 2:대전 3:강릉 4:광주) -> ");
        int wherePlace = sc.nextInt();

        System.out.print("승객 수를 입력하세요 -> ");
        int people = sc.nextInt();


        System.out.print("이동 차량을 선택하세요 (1:스포츠카 2:승용차 3:버스) -> ");
        int whatCar = sc.nextInt();
        System.out.print("부가기능을 사용하시겠습니까? [yes/no]-> ");



        String isAdd = sc.next();
        System.out.println();
        if(isAdd.equalsIgnoreCase("yes")) {
            System.out.println("추가 기능을 사용하셨습니다");
            isAddFunc = true;
        }
        else {
            System.out.println("추가 기능을 껐습니다");
            isAddFunc = false;
        }


        switch (whatCar) {
            case 1:

                if(isAddFunc == true) sportsCar.maxSpeed *= 1.2;

                System.out.print("총 가격은 : ");
                System.out.println(sportsCar.totalPrice(people,distance[wherePlace]));
                System.out.print("총 주유 횟수 : ");
                System.out.println(sportsCar.oiling(people,distance[wherePlace]));
                System.out.print("총 시간 : ");
                System.out.println(sportsCar.howLong(people,distance[wherePlace]));
                break;
            case 2:

                if(isAddFunc == true) passengerCar.seat += 1;

                System.out.print("총 가격은 : ");
                System.out.println(passengerCar.totalPrice(people,distance[wherePlace]));
                System.out.print("총 주유 횟수 : ");
                System.out.println(passengerCar.oiling(people,distance[wherePlace]));
                System.out.print("총 시간 : ");
                System.out.println(passengerCar.howLong(people,distance[wherePlace]));
                break;
            case 3:

                if(isAddFunc == true) bus.tankSize += 30;

                System.out.print("총 가격은 : ");
                System.out.println(bus.totalPrice(people,distance[wherePlace]));
                System.out.print("총 주유 횟수 : ");
                System.out.println(bus.oiling(people,distance[wherePlace]));
                System.out.print("총 시간 : ");
                System.out.println(bus.howLong(people,distance[wherePlace]));
                break;
            default:
                System.out.println("잘못입력하셨습니다"); break;
        }

    }

}
