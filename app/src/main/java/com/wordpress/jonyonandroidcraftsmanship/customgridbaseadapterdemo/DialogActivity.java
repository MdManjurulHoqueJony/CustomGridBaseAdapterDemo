package com.wordpress.jonyonandroidcraftsmanship.customgridbaseadapterdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogActivity extends Activity {

    private ImageView ivTitle = null;
    private TextView tvTitle = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        initialize();
        setValues();
    }

    private void setValues() {
        Intent intent=getIntent();
        int image=intent.getIntExtra(getString(R.string.title_image_tag), R.drawable.title1);
        String title=intent.getStringExtra(getString(R.string.title_tag));
        ivTitle.setImageResource(image);
        tvTitle.append(" "+title);
    }

    private void initialize() {
        ivTitle= (ImageView) findViewById(R.id.ivTitle);
        tvTitle= (TextView) findViewById(R.id.tvTitle);
    }

    public void closeDialog(View view) {
        finish();
    }
}
