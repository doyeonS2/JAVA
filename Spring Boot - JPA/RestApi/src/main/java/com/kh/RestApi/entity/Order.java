package com.kh.RestApi.entity;
import com.kh.RestApi.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

// 주문 테이블

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {
    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;
    @ManyToOne // 한명의 회원은 여러번 주문을 할 수 있으므로 다대일 관계
    @JoinColumn(name = "member_id")
    private Member member;
    private LocalDateTime orderDate; //  주문일
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; // 주문 상태
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
