package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

// 생성할 디비 만들기
@Getter
@Setter
@ToString
@Entity // 디비 테이블
@Table(name="item")
public class Item {
    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // 상품 코드
    @Column(nullable = false, length = 50) // NULL은 허용 안 함
    private String itemNm; // 상품명
    @Column(name="price", nullable = false)
    private int price; // 가격
    @Column(nullable = false)
    private int stockNumberl; // 재고 수량
    @Lob // 긴 데이터를 쓸 때 사용
    @Column(nullable = false)
    private String itemDetail; // 상품에 대한 상세 설명
    @Enumerated(EnumType.STRING) // Enum에 포함된 이름이 그대로 들어감(SELL, SOLD_OUT)
    private ItemSellStatus itemSellStatus; // 상품 판매 상태
    private LocalDateTime regTime; // 상품 등록 시간
    private LocalDateTime updateTime; // 상품 수정 시간
}
