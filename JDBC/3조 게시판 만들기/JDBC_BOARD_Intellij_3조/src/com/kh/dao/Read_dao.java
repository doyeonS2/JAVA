package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.WriteVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Read_dao {
    public List<WriteVO> Read() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<WriteVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM WRITE";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String write_Name = rs.getString("WRITE_NAME");
                int write_num = rs.getInt("WRITE_NUM");
                String write_Title = rs.getString("WRITE_TITLE");
                String write_Contents = rs.getString("WRITE_CONTENTS");
                String write_Id = rs.getString("WRITE_ID");
                String write_RDate = rs.getString("WRITE_RDATE");
                int write_ViewCnt = rs.getInt("WRITE_VIEWCNT");
                String public_file = rs.getString("PUBLIC_FILE");

                WriteVO vo = new WriteVO(write_Name, write_num, write_Title,
                        write_Contents, write_Id, write_RDate, write_ViewCnt,public_file);
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

    public void printRead(List<WriteVO> list2) {
        for (WriteVO e : list2) {
            System.out.print(e.getWrite_Name() + " ");
            System.out.print(e.getWrite_num() + " ");
            System.out.print(e.getWrite_Title() + " ");
            System.out.print(e.getWrite_Contents() + " ");
            System.out.print(e.getWrite_Id() + " ");
            System.out.print(e.getWrite_RDate() + " ");
            System.out.print(e.getWrite_ViewCnt() + " ");
            System.out.print(e.getPublic_File() + " ");
            System.out.println();
        }
    }
}