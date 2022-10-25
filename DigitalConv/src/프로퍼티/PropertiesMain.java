package 프로퍼티;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// 프로퍼티? 키와 값이 String 타입으로 제한된 Map 컬렉션 입니다.
// 주로 설정 정보 읽는 용도로 사용됩니다.
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 현재 클래스에서 database.properties 파일의 경로 정보를 가져옴
        String path = PropertiesMain.class.getResource("../database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8"); // 한글에 대한 정보를 읽어오기 위해서 사용
        properties.load(new FileReader(path)); // 해당 경로에서 파일을 읽어들임
        String driver = properties.getProperty("driver"); // 문자열의 키값으로 문자열의 값을 읽음
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
