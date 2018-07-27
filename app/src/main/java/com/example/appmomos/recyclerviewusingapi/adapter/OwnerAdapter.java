package com.example.appmomos.recyclerviewusingapi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appmomos.recyclerviewusingapi.PostApiActivity;
import com.example.appmomos.recyclerviewusingapi.R;
import com.example.appmomos.recyclerviewusingapi.modelClasses.OwnerNameModel;

import butterknife.BindView;
import butterknife.ButterKnife;


public class OwnerAdapter extends RecyclerView.Adapter<OwnerAdapter.ViewHolder>
{

    Context context;
    OwnerNameModel ownerNameModel;
    LayoutInflater inflater;

    public OwnerAdapter(Context context, OwnerNameModel ownerNameModel)
    {
        this.context = context;
        this.ownerNameModel = ownerNameModel;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = inflater.inflate(R.layout.sector_items,parent,false);
        return new OwnerAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.title.setText(ownerNameModel.getDeliveredOrders().get(position).getOwnerName());
    }

    @Override
    public int getItemCount() {
        return ownerNameModel.getDeliveredOrders().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.title)
        TextView title;


        public ViewHolder(View itemView)
        {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
