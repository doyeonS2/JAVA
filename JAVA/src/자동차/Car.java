package 자동차;

public class Car {  // 부모 자동차 클래스 (기본 자동차)

    int maxSpeed = 120;
    int gasMile = 10;
    int tankSize = 30;
    int seat = 4;

    public void getInfo() {
        System.out.println("---------------------");
        System.out.println("최고속력 : " + maxSpeed);
        System.out.println("연비 : " + gasMile);
        System.out.println("탱크크기 : " + tankSize);
        System.out.println("좌석수 : " + seat);
    }

    /*
    1. 승객수를 통해 몇번 왔다갔다 해야하는지 계산
    2.

     */

    // 휘발유 금액 / 연비 = 000원 / km
    public int totalPrice (int passenger, int distance ) {

        // System.out.println("탱크 사이즈 : " + this.tankSize);
        // System.out.println("현재 차의 좌석 : " + this.seat);
        double howTimes = Math.ceil((double)passenger/this.seat); // 몇번 가야하는지 횟수

        //  System.out.println("몇번이동 : " + howTimes);

        double totalDistance = howTimes * distance; // 총 길이

        // System.out.println("총 길이 : "+ (int)totalDistance);

        double totalMoney = (double) 2000 / (double)this.gasMile * totalDistance;

        return (int)totalMoney;
    }

    public int oiling (int passenger, int distance ) {

        double howTimes = Math.ceil((double)passenger/this.seat); // 몇번 가야하는지 횟수
        double totalDistance = howTimes * distance; // 총 이동 거리
        // 총 쓰는 기름리터 (totalDistance동안)
        // System.out.println("총 이동 거리 : " + totalDistance);
        // System.out.println("이 차의 연비 : " + this.gasMile);
        // System.out.println("넣어야 하는 리터 수 : " + totalDistance/this.gasMile);
        // System.out.println("주유횟수 (올림 전)" + (double)totalDistance/(double)this.gasMile/(double)this.tankSize);
        double oilingTime = Math.ceil ((double)totalDistance/(double)this.gasMile/(double)this.tankSize);
        return (int) oilingTime;
    }

    // 최고속도 , 총 거리
    //거리 / 속도 = 시간
    public double howLong (int passenger, int distance) {
        double howTimes = Math.ceil((double)passenger/this.seat); // 몇번 가야하는지 횟수
        double totalDistance = howTimes * distance; // 총 이동 거리
        //System.out.println("총 이동거리 : " + totalDistance);
        //System.out.println("최고속력 : " + this.maxSpeed);
        double howTime = totalDistance/this.maxSpeed;
        return howTime;
    }
}

class SportsCar extends Car{ // sportsCar 클래스
    public SportsCar() {
        this.maxSpeed = 250;
        this.gasMile = 8;
        this.tankSize = 30;
        this.seat = 2;
    }
}
class PassengerCar extends Car{ // passengerCar 클래스
    public PassengerCar() {
        this.maxSpeed = 200;
        this.gasMile = 12;
        this.tankSize = 45;
        this.seat = 4;
    }
}
class Bus extends Car{ // Bus 클래스
    public Bus() {
        this.maxSpeed = 150;
        this.gasMile = 5;
        this.tankSize = 100;
        this.seat = 20;
    }
}
