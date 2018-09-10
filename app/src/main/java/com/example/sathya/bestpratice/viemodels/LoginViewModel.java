package com.example.sathya.bestpratice.viemodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.sathya.bestpratice.BR;
import com.example.sathya.bestpratice.model.User;

public class LoginViewModel extends BaseObservable {
    private User user;

    private String success = "Login was successfully";
    private String password = "Email or Password not valid";

    public LoginViewModel() {
        user = new User("", "");
    }

    @Bindable
    public String toastMessage = null;


    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void afterEmailTextChanged(CharSequence s) {
        user.setEmailId(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        user.setPassword(s.toString());
    }

    public void onLoginClicked() {
        if (user.isInputValidation())
            setToastMessage(success);
        else
            setToastMessage(password);
    }


}
