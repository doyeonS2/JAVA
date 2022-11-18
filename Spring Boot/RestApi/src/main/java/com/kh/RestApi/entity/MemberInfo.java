package com.kh.RestApi.entity;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

// 디비 생성

@Data // 게터, 세터, 생성자 등을 자동으로 만들어줌
@Entity
@Table(name="member_info") // 테이블 이름
public class MemberInfo {
    @Id // 프라이머리 키
    @GeneratedValue(strategy = GenerationType.AUTO) // JPA 규칙대로 증가
    private Long id; // GeneratedValue : 값이 증가되는 특성이 있어서 Long이나 int로 해야함(String 타입은 증가시킬 수 없으니까..)
    private String userId;
    private String pwd;
    private String name;
    private String email;
    private LocalDateTime join;
}
