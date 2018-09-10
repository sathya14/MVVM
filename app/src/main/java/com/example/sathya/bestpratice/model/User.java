package com.example.sathya.bestpratice.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;

public class User {
    @NonNull
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(@NonNull String emailId) {
        this.emailId = emailId;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    private String emailId;

    @NonNull
    private String password;

    public User(@NonNull String emailId,  @NonNull String password) {
        this.emailId = emailId;
        this.password = password;
    }


    public boolean isInputValidation(){
        return !TextUtils.isEmpty(getEmailId()) && !TextUtils.isEmpty(getPassword());
    }
}
