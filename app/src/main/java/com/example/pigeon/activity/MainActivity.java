package com.example.pigeon.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.pigeon.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.btnDrawer)
    void btnDrawer() {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @OnClick(R.id.btnFual)
    void btnFual() {
        startActivity(new Intent(this,VehicalActivity.class));
    }

    @OnClick(R.id.btnMotercycle)
    void btnMotercycle() {
        startActivity(new Intent(this,VehicalActivity.class));
    }

    @BindView(R.id.llDrawer)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}