package com.salidas.proyecto1.controller.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.salidas.proyecto1.R;

/**
 * Created by esteban on 13/03/17.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvAppName;
    private EditText etChupamela;
    private Button btnLeft, btnRight, btnBottom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAppName = (TextView) findViewById(R.id.tvAppName);
        btnBottom = (Button) findViewById(R.id.btnBottom);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);
        etChupamela = (EditText) findViewById(R.id.etChupamela);

        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);
        btnBottom.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBottom:
                Toast.makeText(this, getString(R.string.str_bottom_click), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLeft:
                Toast.makeText(this, getString(R.string.str_left_click), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnRight:
                Toast.makeText(this, getString(R.string.str_right_click), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
