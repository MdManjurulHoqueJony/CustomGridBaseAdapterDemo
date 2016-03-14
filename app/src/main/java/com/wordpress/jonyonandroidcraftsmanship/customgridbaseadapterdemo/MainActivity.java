package com.wordpress.jonyonandroidcraftsmanship.customgridbaseadapterdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private GridView grdCustom=null;
    private CustomBaseAdapter customBaseAdapter=null;
    private MyListItemClickListener myListItemClickListener = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        grdCustom= (GridView) findViewById(R.id.grdCustom);
        customBaseAdapter=new CustomBaseAdapter(this);
        myListItemClickListener=new MyListItemClickListener();
        grdCustom.setAdapter(customBaseAdapter);
        grdCustom.setOnItemClickListener(myListItemClickListener);
    }

    private class MyListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            MyViewHolder viewHolder= (MyViewHolder) view.getTag();
            SingleItem singleItem= (SingleItem) viewHolder.getIvTitle().getTag();
            Intent intent=new Intent(MainActivity.this,DialogActivity.class);
            intent.putExtra(getString(R.string.title_tag),singleItem.getTitle());
            intent.putExtra(getString(R.string.title_image_tag),singleItem.getTitleImage());
            startActivity(intent);
        }
    }


}
