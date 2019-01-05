package com.example.user.ligainggris;

import android.view.View;

public class ItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;
    public ItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
