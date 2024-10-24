package UTS.SistemManajemenPerpustakaan;

import java.util.Date;

public class PerpustakaanMain {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setJudul("It Ends With Us");
        buku1.setPenulis("Colleen Hoover");
        buku1.setTahunTerbit(2016);

        System.out.println("-- Informasi Buku: --");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());
        System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
        System.out.println("Status: " + (buku1.getStatus() ? "Tersedia" : "Tidak tersedia"));

    
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Aqila Nur Azza");
        anggota1.setIdAnggota("A001");
        anggota1.setTanggal(new Date());

        System.out.println("\n-- Informasi Anggota: --");
        System.out.println("Nama: " + anggota1.getNama());
        System.out.println("ID Anggota: " + anggota1.getIdAnggota());
        System.out.println("Tanggal Daftar: " + anggota1.getTanggal());

        // Proses peminjaman buku oleh anggota
        System.out.println("\n-- Proses peminjaman buku --");
        buku1.pinjam(anggota1.getNama());
        System.out.println("Status Buku " + buku1.getJudul() + " : " + (buku1.getStatus() ? "Tersedia" : "Tidak tersedia"));

        // Proses pengembalian buku oleh anggota
        System.out.println("\n-- Proses pengembalian buku --");
        buku1.kembalikan();
        System.out.println("Status Buku " + buku1.getJudul() + " : " + (buku1.getStatus() ? "Tersedia" : "Tidak tersedia"));
    }
}
