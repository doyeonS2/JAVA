package 큐연습;
public class Message {
    String command; //
    String to; // 수신처

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
