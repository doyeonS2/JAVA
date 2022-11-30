package com.kh.chat;
import lombok.Getter;
import lombok.Setter;

// 있어야 할 거? 채팅방 방 번호, 사용자 아이디
@Getter
@Setter
public class ChatMessage {
    public enum MessageType {
        // 선언부
        // ENTER : 방번호로 들어옴 (ㅇㅇㅇ님이 입장했습니다.) - 채팅방 최초 진입
        // TALK : 대화중
        ENTER, TALK
    }
    // 사용하는 부분 (이 네가지는 무조건 포함해야 함)
    private MessageType type; // 익명인지?아닌지?
    private String roomId; // 방번호
    private String sender; // 메세지를 누가 보냈는지?
    private String message; // 실제 메세지 내용
}
