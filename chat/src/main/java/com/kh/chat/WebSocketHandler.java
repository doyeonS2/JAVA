package com.kh.chat;
import com.fasterxml.jackson.databind.ObjectMapper; // jackson : json을 파싱하는 도구 중 하나
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@RequiredArgsConstructor // 이거 넣으면 생성자 안만들어줘도됨
@Slf4j // 로그 파일 쓰는 거..
@Component // Bean에 등록하는 대표적인 어노테이션
public class WebSocketHandler extends TextWebSocketHandler {
    private final ObjectMapper objectMapper; // json 데이터를 ChatMessage Class로 변경하기 위해서..
    private final ChatService chatService;
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message)
            throws Exception {
        String payload = message.getPayload();
        log.warn("{}", payload); // 메세지 찍어보기
        ChatMessage chatMessage = objectMapper.readValue(payload, ChatMessage.class); // 메세지를 실제 담는 부분
        ChatRoom chatRoom = chatService.findRoomById(chatMessage.getRoomId()); // 채팅룸 찾기
        chatRoom.handleActions(session, chatMessage, chatService); // chatMessage, chatService 넘겨주기
    }

}
