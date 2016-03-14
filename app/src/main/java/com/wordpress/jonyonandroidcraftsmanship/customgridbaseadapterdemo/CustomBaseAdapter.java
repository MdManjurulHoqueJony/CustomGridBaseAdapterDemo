package com.wordpress.jonyonandroidcraftsmanship.customgridbaseadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {

    private ArrayList<SingleItem> items = null;
    private Context context;

    public CustomBaseAdapter(Context context) {
        this.context = context;
        items = new ArrayList<SingleItem>();
        String[] titles = context.getResources().getStringArray(R.array.titles);
        int[] images = new int[]{R.drawable.title1,
                R.drawable.title2,
                R.drawable.title3,
                R.drawable.title4,
                R.drawable.title5,
                R.drawable.title6,
                R.drawable.title7,
                R.drawable.title8,
                R.drawable.title9,
                R.drawable.title10,
                R.drawable.title11,
                R.drawable.title12,
                R.drawable.title13,
                R.drawable.title14,
                R.drawable.title15,
                R.drawable.title16,
                R.drawable.title17,
                R.drawable.title18,
                R.drawable.title19,
                R.drawable.title20};
        for (int i = 0; i < 20; i++) {
            SingleItem singleItem = new SingleItem(images[i], titles[i]);
            items.add(singleItem);
        }
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        MyViewHolder viewHolder = null;
        SingleItem singleItem = null;

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.single_item, parent, false);
            viewHolder = new MyViewHolder(view);
            view.setTag(viewHolder);
            Logger.log(context.getString(R.string.msg_new_item));
        } else {
            viewHolder = (MyViewHolder) view.getTag();
            Logger.log(context.getString(R.string.msg_recycling));
        }

        singleItem = items.get(position);
        viewHolder.getIvTitle().setImageResource(singleItem.getTitleImage());
        viewHolder.getIvTitle().setTag(singleItem);
        return view;
    }
}
