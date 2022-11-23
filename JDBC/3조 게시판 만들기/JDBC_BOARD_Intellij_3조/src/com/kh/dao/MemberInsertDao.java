package com.kh.dao;

import com.kh.util.Common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MemberInsertDao {
    public void empInsert() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("회원가입 정보를 입력하세요");
        System.out.print("회원번호 : ");
        int MEMBER_NUM = sc.nextInt();
        System.out.print("ID : ");
        String ID = sc.next();
        System.out.print("PASSWORD : ");
        String PASSWORD = sc.next();
        System.out.print("이름 : ");
        String NAME = sc.next();
        System.out.print("생일 : ");
        String BIRTH = sc.next();
        System.out.print("성별 : ");
        String GENDER = sc.next();
        GENDER = GENDER.toUpperCase();
        System.out.print("이메일주소 : ");
        String EMAIL = sc.next();
        System.out.print("휴대폰 번호 : ");
        String PHONE = sc.next();
        System.out.print("추천인 ID : ");
        sc.nextLine();
        String RECOMMENDER_ID = sc.nextLine();
        System.out.print("가입일 : ");
        String REG_DATE = sc.next();

        String query = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            conn = Common.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, MEMBER_NUM);
            pstmt.setString(2, ID);
            pstmt.setString(3, PASSWORD);
            pstmt.setString(4, NAME);
            pstmt.setString(5, BIRTH);
            pstmt.setString(6, GENDER);
            pstmt.setString(7, EMAIL);
            pstmt.setString(8, PHONE);
            pstmt.setString(9, RECOMMENDER_ID);
            pstmt.setString(10, REG_DATE);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(pstmt);
        Common.close(conn);

    }
}

