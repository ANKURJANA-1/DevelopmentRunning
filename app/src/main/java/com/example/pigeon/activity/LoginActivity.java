package com.example.pigeon.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pigeon.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @OnClick(R.id.btnFacbook)
    void btnFacbook() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.btnPhone)
    void btnPhone() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.btnGoogle)
    void btnGoogle() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.btnMail)
    void btnMail() {
        startActivity(new Intent(this, MainActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}