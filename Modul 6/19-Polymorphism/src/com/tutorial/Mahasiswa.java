package com.tutorial;

public class Mahasiswa extends Manusia {
    private String namaMhs;

    public void setNama(String nama) {
        this.namaMhs = nama;
    }

    public String getNama() {
        return "Nama mahasiswa: " + namaMhs;
    }
}
