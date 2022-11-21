package 쓰레드복습3;
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
public class ThEx3 {
    public static void main(String[] args) {
        WorkObject shareObject = new WorkObject(); // 공유 객체 생성 - 쓰레드A와 쓰레드B에서 공유할 객체를 만든 것!
        ThreadA threadA = new ThreadA(shareObject);
        ThreadB threadB = new ThreadB(shareObject);
        threadA.start();
        threadB.start();

    }
}
