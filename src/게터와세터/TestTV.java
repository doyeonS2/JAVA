package 게터와세터;
// 데이터은닉 특성 때문에 나온 개념
// Getter : 인스턴스 필드의 값을 읽기 위한 메소드
// Setter : 인스턴스 필드의 값을 쓰기 위한 메소드
// 필요한 이유는 인스턴스 필드에 대한 외부 접근에 대한 허용을 막아야 하기 때문
public class TestTV {
    private final static String company = "LG";
    private boolean isPower; // 데이터은닉
    int channel;
    private int volume;
    private int screenRate; // Auto, 16:9, 4:3

    final static String getCompany() {
        return company;

    }

    public TestTV(boolean isPower, int channel, int volume, int screenRate) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
        this.screenRate = screenRate;
    }

    public boolean isPower() {
        return isPower;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getScreenRate() {
        return screenRate;
    }

    public void setScreenRate(int screenRate) {
        this.screenRate = screenRate;
    }
}

