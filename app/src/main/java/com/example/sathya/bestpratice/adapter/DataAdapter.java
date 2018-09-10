package com.example.sathya.bestpratice.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.sathya.bestpratice.R;
import com.example.sathya.bestpratice.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder>{
    private List<ItemModel> itemModelList;

    public DataAdapter() {
        this.itemModelList=new ArrayList<>();
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item,
                new FrameLayout(parent.getContext()),false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.DataViewHolder holder, int position) {
    ItemModel itemModel=itemModelList.get(position);
    holder.textView.setText(itemModel.getItemName());

    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }


    public class DataViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public DataViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.itemData);
        }
    }
    public void updateData(@Nullable List<ItemModel> itemModelList) {
        if (itemModelList == null || itemModelList.isEmpty()) {
            this.itemModelList.clear();
        } else {
            this.itemModelList.addAll(itemModelList);
        }
        notifyDataSetChanged();
    }
}
