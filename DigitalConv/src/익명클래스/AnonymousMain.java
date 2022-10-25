package 익명클래스;

import 인터페이스3.RemoteControl;

public class AnonymousMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("자동차의 에어컨을 켭니다.");

            }

            @Override
            public void turnOFF() {
                System.out.println("자동차의 에어컨을 끕니다.");

            }

            @Override
            public void setVolume(int volume) {
                System.out.println("에어컨의 세기를 " + volume + " 변경 합니다.");

            }
        };
        remoteControl.turnON();
        remoteControl.turnOFF();
        remoteControl.setVolume(100);
    }
}
