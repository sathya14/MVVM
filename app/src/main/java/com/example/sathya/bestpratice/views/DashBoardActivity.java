package com.example.sathya.bestpratice.views;

import android.app.Activity;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.sathya.bestpratice.R;
import com.example.sathya.bestpratice.adapter.DataAdapter;
import com.example.sathya.bestpratice.databinding.ActivityMainBinding;
import com.example.sathya.bestpratice.model.ItemModel;
import com.example.sathya.bestpratice.viemodels.DashBoardViewModel;

import java.util.List;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

public class DashBoardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewDashBoard(new DashBoardViewModel());
        activityMainBinding.executePendingBindings();

        initRecyclerView(activityMainBinding.getRoot());

    }


    private void initRecyclerView(View view){
        RecyclerView recyclerView=view.findViewById(R.id.listViewData);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), VERTICAL));
    }

    @BindingAdapter({"adapter", "data"})
    public void bind(RecyclerView recyclerView, DataAdapter adapter, List<ItemModel> data) {
        recyclerView.setAdapter(adapter);
        adapter.updateData(data);
    }
}
