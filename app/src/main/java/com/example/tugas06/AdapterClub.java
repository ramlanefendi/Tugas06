package com.example.tugas06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClub extends RecyclerView.Adapter<AdapterClub.ViewHolder> {

    private ArrayList<ModelClub> modelClub;

    public AdapterClub(ArrayList<ModelClub> modelClubs) {
        this.modelClub = modelClub;
    }

    @NonNull
    @Override
    public AdapterClub.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClub.ViewHolder holder, int position) {
        holder.Football_Club.setText(modelClub.get(position).getNamaClub());
        holder.logo_club.setImageResource(modelClub.get(position).getLogoClub());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Football_Club;
        ImageView logo_club;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Football_Club = itemView.findViewById(R.id.text_view_football_club);
            logo_club = itemView.findViewById(R.id.image_view_logo_club);



        }
    }
}
