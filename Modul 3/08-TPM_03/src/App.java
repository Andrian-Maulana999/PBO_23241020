class HitungGajiBersih {
    // Deklarasi variabel privat
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter untuk gaji pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk gaji pokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Setter untuk pajak (dalam persen)
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk pajak (dalam rupiah)
    public double getPajak() {
        return (gajiPokok + tunjangan) * (pajak / 100);
    }

    // Method untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double pajakDalamRupiah = getPajak();
        double gajiBersih = (gajiPokok + tunjangan) - pajakDalamRupiah;
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Pajak (dalam rupiah): " + pajakDalamRupiah);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}

public class App {
    public static void main(String[] args) {
        // instansiasi objek
        HitungGajiBersih gaji = new HitungGajiBersih();

        // Set nilai-nilai gaji pokok, tunjangan, dan pajak (%)
        gaji.setGajiPokok(6000000); // nilai gaji pokok
        gaji.setTunjangan(2500000); // nilai tunjangan
        gaji.setPajak(15); // nilai pajak (%)

        // Cetak gaji bersih
        gaji.cetakGajiBersih();
    }
}
