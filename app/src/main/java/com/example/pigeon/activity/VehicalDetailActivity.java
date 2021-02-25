package com.example.pigeon.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pigeon.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class VehicalDetailActivity extends AppCompatActivity {


    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehical_detail);
        ButterKnife.bind(this);
    }
}