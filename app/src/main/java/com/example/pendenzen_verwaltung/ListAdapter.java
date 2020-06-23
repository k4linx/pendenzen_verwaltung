package com.example.pendenzen_verwaltung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        holder.textView.setText(data.get(position).getPendingTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public static class ListViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        public ListViewHolder(@NonNull View view) {
            super(view);
            textView = view.findViewById(R.id.listTextView);
        }
    }
}
