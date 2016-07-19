package com.example.dariopc.socialnetworks.login;

import com.example.dariopc.socialnetworks.login.events.LoginEvent;

/**
 * Created by erick on 21/06/16.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onPause();
    void onResume();
    void checkForAuthenticadedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
