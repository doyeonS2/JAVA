package com.kh.RestApi.entity;
import com.kh.RestApi.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Getter @Setter @ToString
public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // 상품 코드
    @Column(nullable = false, length = 50) // NULL이 올 수 없고, 길이는 50자 제한
    private  String itemName; // 상품명
    @Column(name = "price", nullable = false)
    private int price; // 가격
    @Column(nullable = false)
    private int stockNumber; // 재고 수량
    @Lob
    @Column(nullable = false)
    private String itemDetail; // 상품의 상세 설명
    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; // ENUM타입을 정해줬기 때문에 SELL, SOLD_OUT 둘 중 하나만 올 수 있음
}
