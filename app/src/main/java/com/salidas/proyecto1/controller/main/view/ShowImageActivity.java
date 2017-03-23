package com.salidas.proyecto1.controller.main.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.salidas.proyecto1.R;

/**
 * Created by esteban on 22/03/17.
 */

public class ShowImageActivity extends AppCompatActivity {

    private ImageView ivPhoto;
    private TextView tvPhotoName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        ivPhoto = (ImageView) findViewById(R.id.ivPhoto);
        tvPhotoName = (TextView) findViewById(R.id.tvPhotoName);

        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getExtras().getString("urlPhoto") != null) {
            String urlPhoto = getIntent().getExtras().getString("urlPhoto");
            if (urlPhoto.equals(getString(R.string.str_photo1))) {
                ivPhoto.setImageDrawable(getResources().getDrawable(R.drawable.escudo1));
                tvPhotoName.setText(getString(R.string.str_photo1));
            } else if (urlPhoto.equals(getString(R.string.str_photo2))) {
                ivPhoto.setImageDrawable(getResources().getDrawable(R.drawable.escudo2));
                tvPhotoName.setText(getString(R.string.str_photo2));
            }
            else if (urlPhoto.equals(getString(R.string.str_photo3))) {
                ivPhoto.setImageDrawable(getResources().getDrawable(R.drawable.escudo3));
                tvPhotoName.setText(getString(R.string.str_photo3));
            }
        }

    }
}
