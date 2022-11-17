package com.shop.repository;
import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Test
    @DisplayName("상품 저장 테스트")
    public void createItemTest() {
        Item item = new Item();
        item.setItemNm("아메리카노");
        item.setPrice(4500);
        item.setItemDetail("블랙커피 입니다.");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStockNumberl(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());
        Item savedItem = itemRepository.save(item);
//        LOGGER.error(savedItem.toString());
        log.warn(savedItem.toString());

    }
}