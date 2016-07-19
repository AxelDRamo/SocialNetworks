package com.example.dariopc.socialnetworks.contactlist;

import com.example.dariopc.socialnetworks.contactlist.events.ContactListEvent;

/**
 * Created by erick on 22/06/16.
 */
public interface ContactListPresenter {

    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
