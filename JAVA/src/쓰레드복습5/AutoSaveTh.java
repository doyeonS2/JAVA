package 쓰레드복습5;
// 데몬 쓰레드 : 보조 역할
// AutoSave : 자동 저장 해주다가 내가 끄면 얘도 꺼짐! - 메인 쓰레드가 죽으면 같이 죽음!
public class AutoSaveTh extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함...");
    }
    public void run() {
        while (true) {
            try {
                sleep(1000);

            } catch (InterruptedException e) {}
            save();

        }
    }
}
