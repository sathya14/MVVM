package com.example.sathya.bestpratice.viemodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.example.sathya.bestpratice.model.ItemModel;

public class DashBoardItemViewModel extends BaseObservable {

    private ItemModel itemModel;

    public DashBoardItemViewModel(ItemModel itemModel) {
        this.itemModel=itemModel;
    }

    @Bindable
    public String getData(){
        return !TextUtils.isEmpty(itemModel.getItemName()) ? itemModel.getItemName() :"";
    }
}

