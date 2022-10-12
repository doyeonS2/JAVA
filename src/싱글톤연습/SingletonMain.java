package 싱글톤연습;
// 프로그램 전체에서 단 하나의 객체로 존재
// 장점 : 메모리 정략, 클래스간의 데이터 공유가 주 목적
public class SingletonMain {
    public static void main(String[] args) {
//        // 객체 생성 안됨
//        //Singleton test = new Singleton();
//        Singleton single1 = Singleton.getSingleton();
//        Singleton single2 = Singleton.getSingleton();
//        if(single1 == single2) {
//            System.out.println("같은 싱글톤 객체입니다.");
//        } else {
//            System.out.println("다른 싱글톤 객체입니다.");
//        }
//        System.out.println(single1.id);
//        System.out.println(single1.name);
//        System.out.println(single2.id);
//        System.out.println(single2.name);
//        single1.id = 200;
//        single1.name = "우영우";
//        System.out.println(single2.id);
//        System.out.println(single2.name);

        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        test1.setInfo("동그라미", 27);
        test2.viewInfo();
    }
}
