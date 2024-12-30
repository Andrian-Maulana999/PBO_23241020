package com.tutorial;

public class Karyawan extends Manusia {
    private String namaKar;

    public void setNama(String nama) {
        this.namaKar = nama;
    }

    public String getNama() {
        return "Nama Karyawan: " + namaKar;
    }
}
