package com.example.sathya.bestpratice.views;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sathya.bestpratice.R;
import com.example.sathya.bestpratice.databinding.ActivityRegisterBinding;
import com.example.sathya.bestpratice.viemodels.RegisterViewModel;

public class RegisterActivity extends AppCompatActivity {
   private static ActivityRegisterBinding activityRegisterBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityRegisterBinding= DataBindingUtil.setContentView(this,R.layout.activity_register);
        activityRegisterBinding.setViewRegister(new RegisterViewModel());
        activityRegisterBinding.executePendingBindings();

    }


    @BindingAdapter({"errorMessage"})
    public static void run(View view, String message) {
        if (message!=null) {
            if(message.equalsIgnoreCase("Register Successfuly")){
                Toast.makeText(view.getContext(), message, Toast.LENGTH_LONG).show();
                activityRegisterBinding.inName.setText("");
                activityRegisterBinding.inPassword.setText("");
                activityRegisterBinding.inPhone.setText("");
                activityRegisterBinding.inCity.setText("");
                activityRegisterBinding.inEmail.setText("");
                Intent intent=new Intent(view.getContext(),DashBoardActivity.class);
                view.getContext().startActivity(intent);
            }else{
                activityRegisterBinding.inName.setError("Name is Empty");
                activityRegisterBinding.inCity.setError("City is Empty");
                activityRegisterBinding.inEmail.setError("Email is Empty");
                activityRegisterBinding.inPhone.setError("Phone is Empty");
                activityRegisterBinding.inPassword.setError("Password is Empty");
            }
        }
    }

}
