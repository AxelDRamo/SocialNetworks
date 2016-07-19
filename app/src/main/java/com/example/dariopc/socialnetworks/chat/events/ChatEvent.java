package com.example.dariopc.socialnetworks.chat.events;

import com.example.dariopc.socialnetworks.entities.ChatMessage;

/**
 * Created by zarathos on 24/06/16
 */
public class ChatEvent {
    ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
