package com.example.pendenzen_verwaltung;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>  {

    private List<Pending> data;


    public ListAdapter(List<Pending> data){
        this.data = data;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.listTextView.setText(data.get(position).getPendingTitle());
        holder.listDescriptionView.setText(data.get(position).getPendingDescription());
        holder.listDateView.setText(data.get(position).getPendingDate());
        Log.d("importance", "importance: " + data.get(position).getPendingImportance());
        switch (data.get(position).getPendingImportance()){
            case '0':
                holder.priorityView.setImageResource(R.mipmap.ic_low_priority_foreground);
            case '1':
                holder.priorityView.setImageResource(R.mipmap.ic_medium_priority_foreground);
            case '2':
                holder.priorityView.setImageResource(R.mipmap.ic_high_priority_foreground);
            default:
                holder.priorityView.setImageResource(R.mipmap.ic_low_priority_foreground);

        }
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
    public static class ListViewHolder extends RecyclerView.ViewHolder {
        TextView listTextView;
        TextView listDescriptionView;
        TextView listDateView;
        CheckBox itemCheckBox;
        ImageView priorityView;


        public ListViewHolder(@NonNull View view) {
            super(view);
            listTextView = view.findViewById(R.id.listTextView);
            listDescriptionView = view.findViewById(R.id.listDescriptionView);
            listDateView = view.findViewById(R.id.listDateView);
            itemCheckBox = view.findViewById(R.id.itemCheckBox);
            priorityView = (ImageView) view.findViewById(R.id.priorityView);
        }
    }
}
