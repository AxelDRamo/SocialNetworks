package com.example.dariopc.socialnetworks.chat.ui;

import com.example.dariopc.socialnetworks.entities.ChatMessage;

/**
 * Created by zarathos on 24/06/16
 */
public interface ChatView {
    void onMessageReceived(ChatMessage msg);

}
