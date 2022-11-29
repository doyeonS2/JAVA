package com.shop.dto;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// dto : 화면에 표시하기 위한 용도

@Getter @Setter
public class ItemDto {
    private Long id;
    private String itemName;
    private Integer price;
    private String itemDetail;
    private String sellState;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;
}
