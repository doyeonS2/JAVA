package com.kh.mybatis;
import lombok.Data;

// DB 테이블과 매핑할 객체 생성
// @Data : @Getter, @Setter, @Constructor, @ToString..

@Data
public class Company {
    private int id;
    private String name;
    private String address;
}
