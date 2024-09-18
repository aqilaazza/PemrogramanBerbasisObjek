package Restoran;
import java.time.LocalDateTime;

public class Reservasi {
    private LocalDateTime waktuReservasi;
    private String namaTamu;
    private Meja meja;
    private int jumlahKursi;

    public Reservasi(LocalDateTime waktuReservasi, String namaTamu, Meja meja, int jumlahKursi) {
        this.waktuReservasi = waktuReservasi;
        this.namaTamu = namaTamu;
        this.meja = meja;
        this.jumlahKursi = jumlahKursi;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public LocalDateTime getWaktuReservasi() {
        return waktuReservasi;
    }

    public Meja getMeja() {
        return meja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void tampilkanInfo() {
            System.out.println("Waktu Reservasi: " + waktuReservasi);
            System.out.println("Nama Tamu: " + namaTamu);
            System.out.println("Meja: " + meja.getNomorMeja());
            System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}
