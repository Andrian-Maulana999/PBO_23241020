package com.tutorial;

public class Persegi extends BangunDatar {
    float sisi;

    Persegi(float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return sisi * sisi;
    }

    public float keliling() {
        return 4 * sisi;
    }
}
