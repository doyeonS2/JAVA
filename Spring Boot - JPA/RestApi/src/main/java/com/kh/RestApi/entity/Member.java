package com.kh.RestApi.entity;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

// 디비 생성

@Data // 게터, 세터, 생성자 등을 자동으로 만들어줌
@Entity
@Table(name="member") // 테이블 이름
public class Member {
    @Id // 프라이머리 키
    @GeneratedValue(strategy = GenerationType.AUTO) // ID값 자동 증가 (JPA 규칙대로 증가)
    private Long memberId; // GeneratedValue : 값이 증가되는 특성이 있어서 Long이나 int로 해야함(String 타입은 증가시킬 수 없으니까..)
    private String userId;
    private String pwd;
    private String name;
    @Column(unique = true)
    private String email;
    private LocalDateTime regData;
}
