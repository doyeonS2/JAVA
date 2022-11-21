package 기본타입보조스트림;
import java.io.*;
// 바이트 스트림은 바이트 단위로 입출력 하기 때문에 자바의 기본 타입 단위로 입출력 할 수 없음
// DataInputStream과 DataOutputStream을 연결해서 사용
public class DataTypeStMain {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("C:/파일입출력tmp/primitive.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("우영우");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("동그라미");
        dos.writeDouble(92.5);
        dos.writeInt(2);

        dos.flush(); // 버퍼를 비움
        dos.close();

        FileInputStream fis = new FileInputStream("C:/파일입출력tmp/primitive.txt");
        DataInputStream dis = new DataInputStream(fis);
        String name;
        double score;
        int order;
        name = dis.readUTF();
        score = dis.readDouble();
        order = dis.readInt();
        System.out.println(name + " : " + score + " : " + order);

        name = dis.readUTF();
        score = dis.readDouble();
        order = dis.readInt();
        System.out.println(name + " : " + score + " : " + order);

        dis.close();
    }
}
