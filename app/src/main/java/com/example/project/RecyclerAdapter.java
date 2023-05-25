package com.example.project;

import static android.media.CamcorderProfile.get;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Animals> zooList;

    public RecyclerAdapter(ArrayList<Animals> zooList){

        this.zooList = zooList;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView AnimalText;
        public TextView JsonData;


       public MyViewHolder(final View view) {

           super(view);
           JsonData = view.findViewById(R.id.AnimalName);
           AnimalText = view.findViewById(R.id.AnimalText);

                   }

    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
       String ID  = zooList.get(position).getID();
       String name = zooList.get(position).getName();
        String company = zooList.get(position).getCompany();
        String location = zooList.get(position).getLocation();
        int population = zooList.get(position).getPopulation();
        int Weight = zooList.get(position).getWeight();

        holder.JsonData.setText ("ID: " + ID + "\n name: " + name + "\n company: " + company + "\nlocation: " + location +"" + "\n population: " + population +"\n Weight: " + Weight);


    }

    @Override
    public int getItemCount() {

        return zooList.size();
    }

    public void addAnimal(ArrayList<Animals> zooList){
        this.zooList.clear();
        this.zooList.addAll(zooList);
        notifyDataSetChanged();
    }
}