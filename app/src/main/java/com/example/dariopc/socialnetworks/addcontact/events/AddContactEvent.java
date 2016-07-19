package com.example.dariopc.socialnetworks.addcontact.events;

/**
 * Created by zarathos on 24/06/16
 */
public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
