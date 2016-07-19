package com.example.dariopc.socialnetworks.addcontact.ui;

/**
 * Created by zarathos on 24/06/16
 */
public interface AddContactView {

    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
