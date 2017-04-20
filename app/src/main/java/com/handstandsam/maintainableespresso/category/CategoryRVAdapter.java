package com.handstandsam.maintainableespresso.category;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handstandsam.maintainableespresso.R;

class CategoryRVAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    String[] data = {"Apple", "Banana", "Orange", "Pear", "Grapes", "Mango"};

    public CategoryRVAdapter() {
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recyclerview_category_row, parent, false);
        return new CategoryViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.bindData(data[position], position);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}