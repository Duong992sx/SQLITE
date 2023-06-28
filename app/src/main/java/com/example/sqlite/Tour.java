package com.example.sqlite;

public class Tour {
    public int id;
     public String TourName;
     public int hinhanh;
     public int Gia;

    public Tour(int id, String tourName, int hinhanh, int gia) {
        this.id = id;
        TourName = tourName;
        this.hinhanh = hinhanh;
        Gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTourName() {
        return TourName;
    }

    public void setTourName(String tourName) {
        TourName = tourName;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }
}
