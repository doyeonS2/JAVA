package com.kh.chat;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatService {
    private final ObjectMapper objectMapper;
    private Map<String, ChatRoom> chatRooms;

    @PostConstruct // 의존성 주입 이후 초기화를 수행하는 메소드
    private void init() {
        chatRooms = new LinkedHashMap<>(); // 방을 쭉~ 생성
    }

    public List<ChatRoom> findAllRoom() {
        return new ArrayList<>(chatRooms.values());
    }

    // 방번호를 찾는 부분
    public ChatRoom findRoomById(String roomId) {
        return chatRooms.get(roomId);
    }

    // 방을 만드는 부분
    public ChatRoom createRoom(String name) { // 방 이름을 가지고 방을 생성
        String randomId = UUID.randomUUID().toString(); // 방 번호 만들고(방 번호 중복 안되게)
        log.info("UUID : " + randomId); // 방 번호 찍어보기
        ChatRoom chatRoom = ChatRoom.builder() // 반환 값을 만들어줌
                .roomId(randomId)
                .name(name)
                .build();
        chatRooms.put(randomId, chatRoom); // randomId, chatRoom를 집어넣고
        return chatRoom; // 리턴해줌
    }

    public <T> void sendMessage(WebSocketSession session, T message) { // <T> : 노션에 JAVA 제네릭 개념 참고 // T : 자료형 와야함
        try {
            session.sendMessage(new TextMessage(objectMapper.writeValueAsString(message)));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }
}
