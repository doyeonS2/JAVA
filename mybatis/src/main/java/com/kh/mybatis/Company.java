package com.kh.mybatis;
import lombok.Data;

import java.util.List;

// DB 테이블과 매핑할 객체 생성
// @Data : @Getter, @Setter, @Constructor, @ToString..

@Data
public class Company {
    private int id;
    private String name;
    private String address;
    private List<Employee> employeeList; // 사원 정보 추가 // Company에서 Employee를 조회할 수 있어야 하니까..
}
