package com.example.sathya.bestpratice.viemodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.sathya.bestpratice.BR;
import com.example.sathya.bestpratice.model.Register;

public class RegisterViewModel extends BaseObservable {
    private Register register;

    private String success="Register Successfuly";
    private String failure="Field is Empty";

    @Bindable
    private String errorMessage=null;

    public RegisterViewModel() {
        register=new Register("","","","","");
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        notifyPropertyChanged(BR.errorMessage);
    }

    public void afterNamTextChanged(CharSequence s){
        register.setName(s.toString());
    }

    public void afterEmailTextChanged(CharSequence s){
        register.setEmailId(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s){
        register.setPassword(s.toString());
    }

    public void afterCityTextChanged(CharSequence s){
        register.setCity(s.toString());
    }

    public void afterPhoneTextChanged(CharSequence s){
        register.setPhone(s.toString());
    }


    public void onRegisterClicked(){
        if(register.isInputRegisterValidation()){
            setErrorMessage(success);
        }else{
            setErrorMessage(failure);
        }
    }

}

