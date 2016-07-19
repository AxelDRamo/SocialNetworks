package com.example.dariopc.socialnetworks.addcontact;

import com.example.dariopc.socialnetworks.addcontact.events.AddContactEvent;
import com.example.dariopc.socialnetworks.addcontact.ui.AddContactView;
import com.example.dariopc.socialnetworks.lib.EventBus;
import com.example.dariopc.socialnetworks.lib.GreenRobotEventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by zarathos on 24/06/16
 */
public class AddContactPresenterImpl implements AddContactPresenter {
    private EventBus eventBus;
    private AddContactView view;
    private AddContactInteractor interactor;

    public AddContactPresenterImpl(AddContactView view){
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.interactor = new AddContactInteractorImpl();
    }

    @Override
    public void onShow() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        view = null;
        eventBus.unregister(this);
    }

    @Override
    public void addContact(String email) {
        if (view != null){
            view.hideInput();
            view.showProgress();
        }
        interactor.execute(email);
    }

    @Override
    @Subscribe
    public void onEventMainThread(AddContactEvent event) {
        if (view != null){
            view.hideProgress();
            view.showInput();
            if(event.isError()){
                view.contactNotAdded();
            }else{
                view.contactAdded();
            }
        }
    }
}
