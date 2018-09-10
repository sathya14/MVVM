package com.example.sathya.bestpratice.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.databinding.BindingAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.sathya.bestpratice.R;

import com.example.sathya.bestpratice.databinding.ActivityMainBinding;
import com.example.sathya.bestpratice.databinding.ActivityLoginBinding;
import com.example.sathya.bestpratice.viemodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLoginBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();

    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
