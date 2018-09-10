package com.example.sathya.bestpratice.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;

public class Register {
    @NonNull
    private String name;

    @NonNull
    private String emailId;

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getCity() {
        return city;
    }

    public void setCity(@NonNull String city) {
        this.city = city;
    }

    @NonNull
    public String getPhone() {
        return phone;
    }

    public void setPhone(@NonNull String phone) {
        this.phone = phone;
    }

    @NonNull
    private String password;

    @NonNull
    private String city;

    @NonNull
    private String phone;


    public Register(@NonNull String name, @NonNull String emailId, @NonNull String password, @NonNull String city, @NonNull String phone) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.city = city;
        this.phone = phone;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(@NonNull String emailId) {
        this.emailId = emailId;
    }

    public boolean isInputRegisterValidation(){
        return !TextUtils.isEmpty(name) && !TextUtils.isEmpty(emailId) &&
                !TextUtils.isEmpty(password) && !TextUtils.isEmpty(city) && !TextUtils.isEmpty(phone);
    }
}
