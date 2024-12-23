package com.tutorial;

public class Main {
    public static void main(String[] args) {

        BangunDatar bgndtr = new BangunDatar();
        bgndtr.cetak();

        Persegi persegi = new Persegi(3);
        System.out.println("Luas Persegi: " + persegi.luas() + "\nKeliling Persegi: " + persegi.keliling());

        PersegiPanjang psgpnjng = new PersegiPanjang(6, 8);
        System.out.println("Luas Persegi Panjang: " + psgpnjng.luas() + "\nKeliling: " + psgpnjng.keliling());

        Lingkaran lingkaran = new Lingkaran(2);
        System.out.println("Luas Lingkaran: " + lingkaran.luas() + "\nKeliling Lingkaran: " + lingkaran.keliling());

        Segitiga segitiga = new Segitiga(8, 12);
        System.out.println("Luas Segitiga: " + segitiga.luas() + "\nKeliling Segitiga: " + segitiga.keliling());

    }
}
