package com.example.dariopc.socialnetworks.chat;

/**
 * Created by zarathos on 24/06/16
 */
public interface ChatInteractor {
    void sendMessage(String msg);
    void setRecipient(String recipient);

    void subscribe();
    void unsubscribe();
    void destroyListener();
}
