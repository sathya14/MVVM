package com.example.sathya.bestpratice.model;

import android.support.annotation.NonNull;

public class ItemModel {
    private String itemName;

    public ItemModel() {

    }

    @NonNull
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}
