// membuat class sebagai template
class Mahasiswa {
    // ciri-ciri atau atribut objek
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi objek
        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.nama = "Rian";
        mhs_1.NIM = "23241020";
        mhs_1.jurusan = "PTI";
        mhs_1.IPK = 3.61;
        mhs_1.umur = 19;

        // cetak objek
        System.out.println("Nama Mahasiswa : " + mhs_1.nama);
        System.out.println("NIM : " + mhs_1.NIM);
        System.out.println("Jurusan : " + mhs_1.jurusan);
        System.out.println("IPK : " + mhs_1.IPK);
        System.out.println("Umur : " + mhs_1.umur);

        Mahasiswa mhs_2 = new Mahasiswa();
        mhs_2.nama = "Bimbim";
        mhs_2.NIM = "23241089";
        mhs_2.jurusan = "PTI";
        mhs_2.IPK = 3.71;
        mhs_2.umur = 19;

        // cetak objek
        System.out.println("Nama Mahasiswa : " + mhs_2.nama);
        System.out.println("NIM : " + mhs_2.NIM);
        System.out.println("Jurusan : " + mhs_2.jurusan);
        System.out.println("IPK : " + mhs_2.IPK);
        System.out.println("Umur : " + mhs_2.umur);
    }
}
