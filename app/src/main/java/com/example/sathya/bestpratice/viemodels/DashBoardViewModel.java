package com.example.sathya.bestpratice.viemodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.sathya.bestpratice.BR;
import com.example.sathya.bestpratice.adapter.DataAdapter;
import com.example.sathya.bestpratice.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class DashBoardViewModel extends BaseObservable {
    private DataAdapter adapter;
    private List<ItemModel> itemModelList;

    public DashBoardViewModel() {
        itemModelList = new ArrayList<>();
        adapter = new DataAdapter();
    }

    public void setUp() {
        getPopulateData();
    }

    @Bindable
    public List<ItemModel> getItemModelList() {
        return this.itemModelList;
    }

    @Bindable
    public DataAdapter getAdapter() {
        return this.adapter;
    }

    private void getPopulateData() {
        for (int i = 0; i <= 50; i++) {
            ItemModel itemModel = new ItemModel();
            itemModel.setItemName("Item Name"+i+1);
            itemModelList.add(itemModel);
        }
        notifyPropertyChanged(BR.itemModelList);
    }
}
