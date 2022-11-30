package com.kh.chat;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.socket.WebSocketSession;
import java.util.HashSet;
import java.util.Set;

// 채팅방 만들기
@Getter
public class ChatRoom {
    private String roomId; // 방번호(중복되면 안됨)
    private String name; // 방이름(중복가능)
    private Set<WebSocketSession> sessions = new HashSet<>(); // Set<> : 중복 허용 안할때 씀
    @Builder // 생성자 추가 이후에 초기화 하는 거??
    public ChatRoom(String roomId, String name) {
        this.roomId = roomId;
        this.name = name;
    }
    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService) { // 3개의 매개변수 받기
        // 조건문 // enum 타입 지정해준 거 여기서..
        if(chatMessage.getType().equals(ChatMessage.MessageType.ENTER)) { // ENTER : 채팅방 최초로 진입
            sessions.add(session);
            chatMessage.setMessage(chatMessage.getSender() + "님이 입장하셨습니다.");
        }
        sendMessage(chatMessage, chatService); // 밑에서 채팅 메세지 만든 것을 날리기

    }
    private <T> void sendMessage(T message, ChatService chatService) {
        sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message)); // parallelStream : 병렬 처리 // forEach : 반복문 // 람다 스타일로 넣기..
    }

}
