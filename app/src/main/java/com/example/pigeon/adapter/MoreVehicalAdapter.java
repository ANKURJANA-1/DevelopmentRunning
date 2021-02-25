package com.example.pigeon.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pigeon.R;
import com.example.pigeon.activity.VehicalDetailActivity;

public class MoreVehicalAdapter extends RecyclerView.Adapter<MoreVehicalAdapter.MyViewHolder> {

    Context context;

    public MoreVehicalAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_vehical, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyViewHolder holder1 = holder;
        holder1.btnVehical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, VehicalDetailActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public Button btnVehical;

        public MyViewHolder(View view) {
            super(view);
            btnVehical = view.findViewById(R.id.btnVehical);

        }
    }

}
