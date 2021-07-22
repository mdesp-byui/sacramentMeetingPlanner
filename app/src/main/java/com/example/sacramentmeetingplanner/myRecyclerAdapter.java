package com.example.sacramentmeetingplanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class myRecyclerAdapter extends RecyclerView.Adapter<myRecyclerAdapter.MyViewHolder> {
    private ArrayList<AgendaModel> agendaList;

    public myRecyclerAdapter(ArrayList<AgendaModel> arrayList) {
        super();
        agendaList = arrayList;
    }

    @NonNull
    @NotNull
    @Override
    public myRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull myRecyclerAdapter.MyViewHolder holder, int position) {
        AgendaModel agendaItem = agendaList.get(position);
        String columnName = agendaItem.getObjectName();
        String columnContent = agendaItem.getObjectContent();

        holder.columnNameText.setText(columnName);
        holder.columnContentText.setText(columnContent);
    }

    @Override
    public int getItemCount() {
        return agendaList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView columnContentText, columnNameText;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            columnNameText = (TextView) itemView.findViewById(R.id.columnNameText);
            columnContentText = (TextView) itemView.findViewById(R.id.columnContentText);
        }
    }
}