package 상속종합TV;
// 양산 TV를 만들기 위해 선행 개발된 프로토타입
public class PrototypeTV {
    boolean isPower; // 전원에 대한 설정값 저장
    int channel; // 채널에 대한 설정값 저장
    int volume; // 볼륨에 대한 설정값 저장
    public PrototypeTV() {} // 기본 생성자
    // 생성자 오버로딩
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 500) {
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }
}
