package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.WriteVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Write_dao {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Scanner sc = new Scanner(System.in);
    // Board 테이블용으로 수정
//    public List<WriteVO> write(){
//        List<WriteVO> list = new ArrayList<>();
//        try{
//            conn = Common.getConnection();
//            stmt = conn.createStatement();
//            String sql = "SELECT * FROM WRITE";
//            rs = stmt.executeQuery(sql);
//
//            while(rs.next()){
//                String write_Name = rs.getString("WRITE_NAME");
//                int    write_num = rs.getInt("WRITE_NUM");
//                String write_Title = rs.getString("WRITE_TITLE");
//                String write_Contents = rs.getString("WRITE_CONTENTS");
//                String write_Id = rs.getString("WRITE_ID");
//                String write_RDate = rs.getString("WRITE_RDATE");
//                int    write_ViewCnt = rs.getInt("WRITE_VIEWCNT");
//
//                WriteVO vo = new WriteVO(write_Name , write_num, write_Title,
//                        write_Contents, write_Id, write_RDate,write_ViewCnt );
//                list.add(vo);
//            }
//            Common.close(rs);
//            Common.close(stmt);
//            Common.close(conn);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return list;
//    }
//
    public void writeSelect() {
        String name ="";
        System.out.println("작성할 게시판을 선택해 주세요");
        System.out.print("[1]공지사항, [2]등업게시판, [3]자유게시판, [4]질문게시판, [5]스터디모집, [6]구인구직, [7]이벤트 -> ");

//        while (true) {
//            System.out.print("[공지사항] [등업게시판] [자유게시판] [질문게시판] [스터디모집] [구인구직] [이벤트] -> ");
//            name = sc.next();
//            if(!name.equals("공지사항") && !name.equals("등업게시판") && !name.equals("자유게시판")
//                    && !name.equals("질문게시판") && !name.equals("스터디모집")
//                    && !name.equals("구인구직") && !name.equals("이벤트"))
//                System.out.print("잘못 입력 하셨습니다. 다시 선택해 주세요");
//            else break;

            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("공지사항");
                name = "공지사항";
            } else if (n == 2) {
                System.out.println("등업게시판");
                name = "등업게시판";
            } else if (n == 3) {
                System.out.println("자유게시판");
                name = "자유게시판";
            } else if (n == 4) {
                System.out.println("질문게시판");
                name = "질문게시판";
            } else if (n == 5) {
                System.out.println("스터디모집");
                name = "스터디모집";
            } else if (n == 6) {
                System.out.println("구인구직");
                name = "구인구직";
            } else if (n == 7) {
                System.out.println("이벤트");
                name = "이벤트";

            }
            System.out.print("글 번호를 입력해 주세요 : ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.print("글 제목을 입력해 주세요 : ");
            String title = sc.nextLine();
            System.out.print("글 내용을 입력해 주세요 : ");
            String contents = sc.nextLine();
            System.out.print("작성자 아이디를 입력해 주세요 : ");
            String id = sc.next();


            String sql = "INSERT INTO WRITE (WRITE_NAME, WRITE_NUM ,WRITE_TITLE ,WRITE_CONTENTS ,WRITE_ID)"
                    + "VALUES(?,?,?,?,?)";

            try {
                conn = Common.getConnection();
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, name);
                pstmt.setInt(2, num);
                pstmt.setString(3, title);
                pstmt.setString(4, contents);
                pstmt.setString(5, id);
                pstmt.executeUpdate();


            } catch (Exception e) {
                e.printStackTrace();
            }
            Common.close(pstmt);
            Common.close(conn);
        }
    }




