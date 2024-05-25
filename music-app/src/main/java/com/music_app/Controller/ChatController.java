package com.music_app.Controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.music_app.Model.ChatMessage;

@Controller
public class ChatController {

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public ChatMessage sendMessage (@Payload ChatMessage chatmessage) {
		chatmessage.setTimestamp(new Date());
		return  chatmessage;
		
	}
}
