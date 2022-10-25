package com.kh.vo;

public class MemberVO {
    private int MEMBER_NUM;

    public int getMEMBER_NUM() {
        return MEMBER_NUM;
    }

    public void setMEMBER_NUM(int MEMBER_NUM) {
        this.MEMBER_NUM = MEMBER_NUM;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getBIRTH() {
        return BIRTH;
    }

    public void setBIRTH(String BIRTH) {
        this.BIRTH = BIRTH;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getRECOMMENDER_ID() {
        return RECOMMENDER_ID;
    }

    public void setRECOMMENDER_ID(String RECOMMENDER_ID) {
        this.RECOMMENDER_ID = RECOMMENDER_ID;
    }

    public String getREG_DATE() {
        return REG_DATE;
    }

    public void setREG_DATE(String REG_DATE) {
        this.REG_DATE = REG_DATE;
    }

    private String ID;
    private String PASSWORD;
    private String NAME;
    private String BIRTH;
    private String GENDER;
    private String EMAIL;
    private String PHONE;
    private String RECOMMENDER_ID;
    private String REG_DATE;
}
