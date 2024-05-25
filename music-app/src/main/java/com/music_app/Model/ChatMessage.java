package com.music_app.Model;

import java.util.Date;


public class ChatMessage {
	
	private String nickname;
	private String message;
	private Date timestamp;
	@Override
	public String toString() {
		return "ChatMessage [nickname=" + nickname + ", message=" + message + ", timestamp=" + timestamp + "]";
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	

}
