package 파일입출력스트림;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 파일 클래스 : 파일이나 디렉토리를 추상화한 클래스 (가장 많이 사용되는 입출력)
public class FileStreamEx {
    public static void main(String[] args) throws URISyntaxException, IOException {
        //File file = new File("C:/파일입출력tmp/문자출력0816_01.txt");
//        File dir = new File("C:/파일입출력tmp"); // 파일 경로만 지정하면 해당 디렉토리에 포함된 목록
//        File file1 = new File("C:/파일입출력tmp/문자출력0816_01.txt");
//        File file2 = new File(new URI("file://C:/파일입출력tmp/문자출력0816_01.txt"));
//
//        if(!dir.exists()) dir.mkdirs(); // 폴더 생성하는 메소드
//        if(!file1.exists()) file1.createNewFile(); // 파일 생성
//        if(!file1.exists()) file2.createNewFile();

        File tmp = new File("C:/파일입출력tmp");
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        File[] contents = tmp.listFiles();
        System.out.println("날짜        시간   형태   크기 이름");
        System.out.println("------------------------------------------");
        for(File file : contents) {
            System.out.print(sdt.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + file.getName());
            } else {
                System.out.print("\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }

    }
}
