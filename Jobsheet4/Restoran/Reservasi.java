package Restoran;
import java.time.LocalDateTime;

public class Reservasi {
    private LocalDateTime waktuReservasi;
    private String namaTamu;
    private Meja meja;

    public Reservasi(LocalDateTime waktuReservasi, String namaTamu, Meja meja) {
        this.waktuReservasi = waktuReservasi;
        this.namaTamu = namaTamu;
        this.meja = meja;
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
}
