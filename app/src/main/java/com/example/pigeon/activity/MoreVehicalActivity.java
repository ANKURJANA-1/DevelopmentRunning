package com.example.pigeon.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pigeon.R;
import com.example.pigeon.adapter.MoreVehicalAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MoreVehicalActivity extends AppCompatActivity {

    @BindView(R.id.recyclerList)
    RecyclerView recyclerList;

    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }

    MoreVehicalAdapter moreVehicalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_vehical);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        moreVehicalAdapter = new MoreVehicalAdapter(this);
        recyclerList.setLayoutManager(new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false));
        recyclerList.setAdapter(moreVehicalAdapter);
    }
}