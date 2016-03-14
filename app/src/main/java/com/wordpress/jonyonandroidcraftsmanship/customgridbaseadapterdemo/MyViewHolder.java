package com.wordpress.jonyonandroidcraftsmanship.customgridbaseadapterdemo;

import android.view.View;
import android.widget.ImageView;

public class MyViewHolder {
    private ImageView ivTitle =null;

    public MyViewHolder(View view) {
        ivTitle = (ImageView) view.findViewById(R.id.ivTitle);
    }

    public ImageView getIvTitle() {
        return ivTitle;
    }
}
