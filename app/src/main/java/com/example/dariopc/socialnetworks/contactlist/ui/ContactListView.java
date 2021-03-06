package com.example.dariopc.socialnetworks.contactlist.ui;

import com.example.dariopc.socialnetworks.entities.User;

/**
 * Created by erick on 22/06/16.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
