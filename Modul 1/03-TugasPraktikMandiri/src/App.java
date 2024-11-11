class Kalkulator {
    // atribut
    double hasilPerkalian;
    double hasilPembagian;
    double hasilPenjumlahan;
    double hasilPengurangan;

    // constructor
    Kalkulator(double bil1, double bil2) {
        hasilPenjumlahan = bil1 + bil2;
        hasilPengurangan = bil1 - bil2;
        hasilPerkalian = bil1 * bil2;
        hasilPembagian = bil1 / bil2;

        System.out.println("\nHasil Penjumlahan : " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan : " + hasilPengurangan);
        System.out.println("Hasil Perkalian  : " + hasilPerkalian);
        System.out.println("Hasil Pembagian : " + hasilPembagian);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi object class kalkulator
        Kalkulator kalkulatorSatu = new Kalkulator(5.2, 2.1);
        Kalkulator kalkulatorDua = new Kalkulator(6, 3);

    }
}
