package 직렬화;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 객체를 바이트 단위로 네트워크 또는 파일에 쓰거나 읽는 방법
public class SerialStMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board board : list) {
            System.out.println("번호 : " + board.getBno());
            System.out.println("제목 : " + board.getTitle());
            System.out.println("저자 : " + board.getWriter());
            System.out.println("날짜 : " + board.getDate());
            System.out.println("----------------------------------------");
        }

    }
    static void writeList() throws IOException {
        List<Board> list = new ArrayList<>(); // List 생성
        list.add(new Board(1, "C++", "고성능언어", "우영우", new Date()));
        list.add(new Board(2, "JAVA", "객체지향언어", "정명석", new Date()));
        list.add(new Board(3, "Python", "쉬운 언어", "이준호", new Date()));

        // 직렬화 과정
        FileOutputStream fos = new FileOutputStream("C:/파일입출력tmp/직렬화.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
    // 역직렬화
    static List<Board> readList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:/파일입출력tmp/직렬화.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board>list = (List<Board>) ois.readObject();
        return list;

    }
}
