package 게터와세터;
// 접근제한자
// public : 누구나 접근 가능
// protected : 상속 관계에서 접근 가능, 같은 패키지 접근 가능
// default : 키워드가 없음, 같은 패키지 내에서만 접근 가능
// private : 같은 클래스 내에서만 접근 가능

public class LGTV extends TestTV {
    public LGTV(boolean isPower, int channel, int volume, int screenRate) {
        super(isPower, channel, volume, screenRate);
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}

