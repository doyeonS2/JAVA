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
import java.util.List;
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
        for(int i = 1; i <= 10; i++) {
            Item item = new Item();
            item.setItemNm("아메리카노" + i);
            item.setPrice(4500 + i);
            item.setItemDetail("블랙커피 입니다." + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumberl(100);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            itemRepository.save(item);
            log.warn(item.toString());
        }
    }
    @Test
    @DisplayName("상품 조회 테스트")
    public void findByItemNmTest() {
        this.createItemTest();
        //List<Item> itemList = itemRepository.findByItemNm("아메리카노10");
        List<Item> itemList = itemRepository.findByItemNmLike("%" + "아메" + "%");
        for(Item item : itemList) {
            log.warn(item.toString());
        }
    }
    @Test
    @DisplayName("상품명, 상품상세설명")
    public void findByItemNmOrItemDetailTest() {
        this.createItemTest();
        List<Item> itemList = itemRepository.findByItemNmOrItemDetail("테스트1", "아메리카노 입니다.");
        for(Item item : itemList) {
            log.warn(item.toString());
        }
    }
    @Test
    @DisplayName("입력받은 가격보다 싼 제품 찾기")
    public void findByPriceLessThanTest() {
        this.createItemTest();
        List<Item> itemList = itemRepository.findByPriceLessThan(4505);
        for(Item item : itemList) {
            log.warn(item.toString());
        }
    }
}