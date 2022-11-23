package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.MemberVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberSelectDao {
    public List<MemberVO> listMember() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<MemberVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM MEMBER";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int MEMBER_NUM = rs.getInt("MEMBER_NUM");
                String ID = rs.getString("ID");
                String PASSWORD = rs.getString("PASSWORD");
                String Name = rs.getString("NAME");
                String Birth = rs.getString("BIRTH");
                String Gender = rs.getString("GENDER");
                String Email = rs.getString("EMAIL");
                String Phone = rs.getString("PHONE");
                String Recommender_ID = rs.getString("RECOMMENDER_ID");
                String Reg_Date = rs.getString("REG_DATE");

                MemberVO vo = new MemberVO();
                vo.setMEMBER_NUM(MEMBER_NUM);
                vo.setID(ID);
                vo.setPASSWORD(PASSWORD);
                vo.setNAME(Name);
                vo.setBIRTH(Birth);
                vo.setGENDER(Gender);
                vo.setEMAIL(Email);
                vo.setPHONE(Phone);
                vo.setRECOMMENDER_ID(Recommender_ID);
                vo.setREG_DATE(Reg_Date);

                list.add(vo);

            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void printEmpSelect(List<MemberVO> list) {
        for (MemberVO e : list) {
            System.out.print(e.getMEMBER_NUM() + " ");
            System.out.print(e.getID() + " ");
            System.out.print(e.getPASSWORD() + " ");
            System.out.print(e.getNAME() + " ");
            System.out.print(e.getBIRTH() + " ");
            System.out.print(e.getGENDER() + " ");
            System.out.print(e.getEMAIL() + " ");
            System.out.print(e.getPHONE() + " ");
            System.out.print(e.getRECOMMENDER_ID() + " ");
            System.out.print(e.getREG_DATE() + " ");
            System.out.println();
        }
    }
}