package com.example.tugas06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterClub adapterClub;
    private ArrayList<ModelClub> modelClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        // Menggunakan tipe data RecyclerView untuk inisialisasi

        // Inisialisasi data sebelum membuat adapter
        getData();

        adapterClub = new AdapterClub(modelClub); // Menggunakan camelCase untuk nama variabel
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Menggunakan recyclerView
        recyclerView.setAdapter(adapterClub); // Menggunakan recyclerView

    }

    private void getData() {
        modelClub = new ArrayList<>();
        modelClub.add(new ModelClub("Barcelona", R.drawable.download));
        modelClub.add(new ModelClub("Real Madrid", R.drawable.madrid));
        modelClub.add(new ModelClub("PSG", R.drawable.psg));
        modelClub.add(new ModelClub("Chelsea", R.drawable.chelsea));
        modelClub.add(new ModelClub("Juventus", R.drawable.juventus));
        modelClub.add(new ModelClub("Manchester United", R.drawable.mu));
        modelClub.add(new ModelClub("Manchester City", R.drawable.mc));
        modelClub.add(new ModelClub("Liverpool", R.drawable.liverpool));
        modelClub.add(new ModelClub("Bayern Munchen", R.drawable.bayern));
        modelClub.add(new ModelClub("Dortmund", R.drawable.dormund)); // Perbaikan penul
    }
}
