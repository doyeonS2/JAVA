package 게터와세터;
public class GetSetMain {
    public static void main(String[] args) {
        String[] rateStr = {"", "AUTO", "16:9", "4:3"};
        TestTV testTV = new TestTV(false, 11, 20, 1);
        System.out.println("전원 : " + testTV.isPower());
        System.out.println("채널 : " + testTV.getChannel());
        System.out.println("볼륨 : " + testTV.getVolume());
        System.out.println("비율 : " + rateStr[testTV.getScreenRate()]);
        // 클래스 메소드
        System.out.println("제조사 : " + TestTV.getCompany());

    }
}
