package 매개변수다형성엑스;
// 매개변수의 다형성 X, 오버로딩으로 구현
public class TypeCastXMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.viewInfo();
    }
}
