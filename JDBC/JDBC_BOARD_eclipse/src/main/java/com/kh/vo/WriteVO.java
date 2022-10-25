package com.kh.vo;

public class WriteVO {
    private String Write_Name;
    private int     Write_num;
    private String  Write_Title;
    private String  Write_Contents;
    private String  Write_Id;
    private String  Write_RDate;
    private int     Write_ViewCnt;

    private String Public_File;

    public String getPublic_File() {
        return Public_File;
    }

    public void setPublic_File(String public_File) {
        Public_File = public_File;
    }

    public String getWrite_Name() {
        return Write_Name;
    }

    public void setWrite_Name(String write_Name) {
        Write_Name = write_Name;
    }

    public int getWrite_num() {
        return Write_num;
    }

    public void setWrite_num(int write_num) {
        Write_num = write_num;
    }

    public String getWrite_Title() {
        return Write_Title;
    }

    public void setWrite_Title(String write_Title) {
        Write_Title = write_Title;
    }

    public String getWrite_Contents() {
        return Write_Contents;
    }

    public void setWrite_Contents(String write_Contents) {
        Write_Contents = write_Contents;
    }

    public String getWrite_Id() {
        return Write_Id;
    }

    public void setWrite_Id(String write_Id) {
        Write_Id = write_Id;
    }

    public String getWrite_RDate() {
        return Write_RDate;
    }

    public void setWrite_RDate(String write_RDate) {
        Write_RDate = write_RDate;
    }

    public int getWrite_ViewCnt() {
        return Write_ViewCnt;
    }

    public void setWrite_ViewCnt(int write_ViewCnt) {
        Write_ViewCnt = write_ViewCnt;
    }

    public WriteVO(String write_Name, int write_num, String write_Title,
                   String write_Contents, String write_Id,
                   String write_RDate, int write_ViewCnt, String public_file) {
        Write_Name = write_Name;
        Write_num = write_num;
        Write_Title = write_Title;
        Write_Contents = write_Contents;
        Write_Id = write_Id;
        Write_RDate = write_RDate;
        Write_ViewCnt = write_ViewCnt;
        Public_File = public_file;

    }


}
