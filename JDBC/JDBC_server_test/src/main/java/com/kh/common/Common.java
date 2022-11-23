package com.kh.common;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Common {
   // 오라클 설정 정보(jdbc 연결)
   final static String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
   final static String ORACLE_ID = "SCOTT";
   final static String ORACLE_PW = "TIGER";
   final static String ORACLE_DRV = "oracle.jdbc.driver.OracleDriver";
   
   
   public static Connection getConnection() {
      Connection conn = null;
      try {
         Class.forName(ORACLE_DRV); // 드라이버 로딩
         conn = DriverManager.getConnection(ORACLE_URL, ORACLE_ID, ORACLE_PW); // 메소드 호출
         System.out.println("Connection 연결 성공");
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }
   
   public static void close(Connection conn) {
      try {
         if(conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Connection 해제 성공");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public static void close(Statement stmt) {
      try {
         if(stmt != null && !stmt.isClosed()) {
            stmt.close();
            System.out.println("Statement 해제 성공");
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public static void close(ResultSet rset) {
      try {
         if(rset != null && !rset.isClosed()) {
            rset.close();
            System.out.println("Result set 해제 성공");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   // CORS 처리
   public static HttpServletResponse corsResSet(HttpServletResponse res) {
      res.setContentType("application/json;charset=utf-8");   
      res.setHeader("Access-Control-Allow-Headers", "Content-Type");
      res.setHeader("Access-Control-Allow-Origin", "*");
      return res;
   }
   
   // 서블릿으로부터 입력받은 내용을 문자열로 변환
   public static StringBuffer reqStringBuff(HttpServletRequest req) {
      StringBuffer sb = new StringBuffer();
      String line = null;
      try {
         // 요청 메시지 받기(프론트엔드가 날린 커맨드의 길이를 모르니까 getReader해서 읽어냄)
         BufferedReader reader = req.getReader(); // 개행 문자를 만나기 전까지 읽음
         // 끝까지 읽어서 더 이상 읽어들일 line이 없으면 line 한 줄 추가
         while((line = reader.readLine()) != null) sb.append(line);      
      } catch (Exception e) {}
      
      return sb;
   }
   
   // JSON Object 만들기
   public static JSONObject getJsonObj(StringBuffer sb) {
      JSONParser parser = new JSONParser();
      JSONObject jsonObj = null;
      try {
         jsonObj = (JSONObject)parser.parse(sb.toString());
      } catch (ParseException e) {
         e.printStackTrace();
      }
      return jsonObj;
   }
}