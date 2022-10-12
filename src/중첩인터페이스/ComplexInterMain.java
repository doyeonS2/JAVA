package 중첩인터페이스;
// 클래스 내부에 인터페이스를 포함하는 경우
public class ComplexInterMain {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setListener(new CallListener());
        btn.touch();
        btn.setListener(new MessageListener());
        btn.touch();

    }
}

