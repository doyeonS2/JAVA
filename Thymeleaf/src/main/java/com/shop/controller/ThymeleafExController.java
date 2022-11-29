package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf") // 기본패스?
public class ThymeleafExController {
    @GetMapping("/ex02") // 패스
    public String thymeleafExample(Model model) {
        ItemDto itemDto = new ItemDto();
        itemDto.setItemDetail("드립 커피 입니다.");
        itemDto.setItemName("아메리카노");
        itemDto.setPrice(4500);
        itemDto.setRegTime(LocalDateTime.now());
        itemDto.setUpdateTime(LocalDateTime.now());
        model.addAttribute("itemDto", itemDto);
        return "thymeleafEx/thymeleafEx02";
    }

    @GetMapping("/ex03")
    public String thymeleafExample03(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("드립 커피 입니다. " + i);
            itemDto.setItemName("오늘의 커피 " + i);
            itemDto.setPrice(1000 * i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDto.setUpdateTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx03";
    }

    @GetMapping("/ex04")
    public String thymeleafExample04(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("내가 직접 내린 드립 커피" + i);
            itemDto.setItemName("도연'S 커피 " + i);
            itemDto.setPrice(1000 * i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDto.setUpdateTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx04";
    }
    @GetMapping("/ex05")
    public String thymeleafExample05() {
        return "thymeleafEx/thymeleafEx05";
    }
    @GetMapping("/ex06")
    public String thymeleafExample06(String param1, String param2, Model model) {
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "thymeleafEx/thymeleafEx06";
    }
    @GetMapping("/ex07")
    public String thymeleafExample07() {
        return "thymeleafEx/thymeleafEx07";
    }
}
