package com.kh.RestApi.entity;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="member_info")
public class MemberInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // JPA 규칙대로
    private Long id; // GenerationType 주면 값이 증가되는 특성이 있어서 Long이나 int로 해야함
    private String userId;
    private String pwd;
    private String name;
    private String email;
    private LocalDateTime join;
}
