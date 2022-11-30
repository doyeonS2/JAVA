package com.kh.chat;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor // 생성자를 안만들기 위해서 넣어주기
@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class ChatController {
    private final ChatService chatService;
    @PostMapping("/chat")
    public ResponseEntity<String> createRoom(@RequestBody String name) { // 방 만들기 // 이름만 받으면 방 번호 자동으로 만들어짐..
        ChatRoom room = chatService.createRoom(name);
        log.info(room.getRoomId()); // 방 번호가 제대로 얻어졌는지 확인하기 위함
        return new ResponseEntity<>(room.getRoomId(), HttpStatus.OK); // 방 번호 알려주기(프엔에서도 방번호를 알아야하니까..)

    }
}
