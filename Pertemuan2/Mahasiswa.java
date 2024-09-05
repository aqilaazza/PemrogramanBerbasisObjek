public class Mahasiswa {
    private String nama;
    private int nim;
    private String kelas;
    private String alamat;
    private String mataKuliah;

    public Mahasiswa(String nama, int nim, String kelas, String alamat, String mataKuliah) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
    }

    public void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Alamat: " + alamat);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }

    public void ubahNama(String nama) {
        this.nama = nama;
    }

    public void ubahKelas(String kelas) {
        this.kelas = kelas;
    }

    public void ubahAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void ubahMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void melakukanAbsensi() {
        System.out.println("Absensi dilakukan untuk mahasiswa " + nama + " dengan NIM " + nim);
    }

    public void cetakKrs() {
        System.out.println("Kartu Rencana Studi (KRS) untuk mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Aqila", 123, "SIB-2A", "Jl. Simpang Remujung no. ", "Algoritma dan Struktur Data");
        
        mahasiswa.tampilkanBiodata();
        mahasiswa.melakukanAbsensi();
        mahasiswa.cetakKrs();
        
        System.out.println("\nMengubah biodata...");
        mahasiswa.ubahMataKuliah("Pemrograman Berbasis Objek");

        mahasiswa.tampilkanBiodata();
        mahasiswa.cetakKrs();
    }
}