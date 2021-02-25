package com.example.pigeon.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pigeon.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class VehicalActivity extends AppCompatActivity {

    @OnClick(R.id.btnSubmit)
    void btnSubmit() {
        startActivity(new Intent(this, MoreVehicalActivity.class));
    }

    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehical);
        ButterKnife.bind(this);
    }
}