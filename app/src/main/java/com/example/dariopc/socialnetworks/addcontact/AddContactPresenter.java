package com.example.dariopc.socialnetworks.addcontact;

import com.example.dariopc.socialnetworks.addcontact.events.AddContactEvent;

/**
 * Created by zarathos on 24/06/16
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
