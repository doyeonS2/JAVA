package 직렬화메뉴쓰기;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWrite {
    // 키와 값으로 구성되는 Map 컬렉션
    static Map<String, CoffeeMenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        menuWrite();
        selectMenu();
    }
    static void menuWrite() {
        map.put("Americano",
                new CoffeeMenuInfo("Americano", 2500, "Coffee", "그냥 커피"));
        map.put("Espresso",
                new CoffeeMenuInfo("Espresso", 1500, "Coffee", "진한 커피"));
        map.put("Latte",
                new CoffeeMenuInfo("Latte", 3500, "Coffee", "우유 커피"));

    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴를 선택하세요 : ");
            System.out.println("[1]메뉴 보기, [2]메뉴 추가, [3]종료 : ");
            int inputMenu = sc.nextInt();
            switch (inputMenu) {
                case 1 :
                    System.out.println("======= 메뉴 보기 =======");
                    // map에서 key 가져와서 향상된 for문 수행
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGroup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println("--------------------------------");
                    }
                    break;
                case 2 :
                    System.out.print("추가할 메뉴를 입력하세요 : ");
                    String key = sc.next(); // key 값이 Map의 Key이면서 메뉴의 이름
                    if (map.containsKey(key)) { // 해당 키가 맵에 존재하는지 확인 (존재하면 true)
                        System.out.println("해당 메뉴가 이미 존재합니다");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.put(key, new CoffeeMenuInfo(key, price, grp, desc));
                    }
                    break;
                case 3 :
                    System.out.println("메뉴를 종료 합니다. 내용을 파일에 저장합니다.");
                    FileOutputStream fos = new FileOutputStream("C:/파일입출력tmp/커피메뉴만들기.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map); // 객체를 직렬화해서 파일에 저장
                    oos.flush(); // 출력했으면 버퍼를 지워야함
                    oos.close(); // 출력을 위한 스트림의 자원을 반납하고 닫기
                    return;

            }

        }

    }
}
