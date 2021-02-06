package pl.krystian.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatMesageController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage getChatMessage(ChatMessage chatMessage){
        return new ChatMessage(chatMessage.getValue() + "GUI");
    }
}
