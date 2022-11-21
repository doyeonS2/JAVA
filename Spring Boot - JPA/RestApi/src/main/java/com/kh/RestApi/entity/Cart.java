package com.kh.RestApi.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import javax.persistence.*;

//장바구니

@Entity
@Getter @Setter @ToString
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne // Member 엔티티와 일대일 매핑
    @JoinColumn(name = "member_id")// 매핑할 외래키 지정
    private Member member; // Member 객체
}