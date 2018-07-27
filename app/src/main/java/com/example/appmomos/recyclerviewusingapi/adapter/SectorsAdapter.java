package com.example.appmomos.recyclerviewusingapi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appmomos.recyclerviewusingapi.R;
import com.example.appmomos.recyclerviewusingapi.modelClasses.SectorsModel;


import butterknife.BindView;
import butterknife.ButterKnife;

public class SectorsAdapter extends RecyclerView.Adapter<SectorsAdapter.ViewHolder>
{
    SectorsModel sectorsModel;
    LayoutInflater inflater;
    Context context;


   public SectorsAdapter(Context context,SectorsModel sectorsModel)
      {
          this.context = context;
          this.sectorsModel = sectorsModel;
          this.inflater = LayoutInflater.from(context);
      }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = inflater.inflate(R.layout.sector_items,parent,false);
        return new SectorsAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(sectorsModel.getProductSectors().get(position).getName());
    }

    @Override
    public int getItemCount() {
        return sectorsModel.getProductSectors().size();
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
