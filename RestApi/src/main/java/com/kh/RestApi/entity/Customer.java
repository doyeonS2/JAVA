package com.kh.RestApi.entity;
import lombok.Data;
import javax.persistence.*;

@Data // Data : 게터, 세터, 생성자, 투 스트링 전부 다 걸어줌
@Entity
public class Customer {
    @Id // Id : 아이디를 프라이머리 키로 지정
    // GeneratedValue : 키 값을 생성하는 전략 - JPA 기준으로 기본키 생성
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    // String : 따로 지정안하면 255자 정도밖에 안들어감
    @Column(length=1024) // 1024만큼 길이를 지정해줌
    private String name;
    private String address;
    private String firstPhone; // 카멜표기법을 쓴 경우 디비에서는 _ 사용된 이름으로 바뀜(firstPhone -> first_phone)
}
