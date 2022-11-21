package 직렬화메뉴읽기;

import 직렬화메뉴쓰기.CoffeeMenuInfo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

// 역직렬화 : 바이트로 직렬화된 파일을 읽어 객체로 변환하기
public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();

    }
    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:/파일입출력tmp/커피메뉴만들기.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, CoffeeMenuInfo> map = new HashMap<>();
        map = (Map<String, CoffeeMenuInfo>) ois.readObject();
        System.out.println("<<역직렬화해서 메뉴를 가져옴>>");
        for(String e : map.keySet()) {
            // get(key) : 키로 값을 얻어옴
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("---------------------------------------");
        }
        fis.close();
        ois.close();
    }
}
