package com.example.tugas06;

public class ModelClub {
    private String namaClub;
    private int logoClub;

    // Constructor
    public ModelClub(String namaClub, int logoClub) {
        this.namaClub = namaClub;
        this.logoClub = logoClub;
    }

    // Getter untuk namaClub
    public String getNamaClub() {
        return namaClub;
    }

    // Getter untuk logoClub
    public int getLogoClub() {
        return logoClub;
    }

}
