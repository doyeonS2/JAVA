package 매개변수다형성엑스;

public class Product {
    int price;
    int bonusPoint;

    void viewInfo() {}

}
class TV extends Product {
    TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }

}
class Computer extends Product {
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class Audio extends Product {
    Audio() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }


    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }


}

