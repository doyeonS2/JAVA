package 싱글톤연습;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // static 붙이면 정적 객체 돼서 못 바꿈
    private Singleton() {
        name = "test";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;

    }
}
