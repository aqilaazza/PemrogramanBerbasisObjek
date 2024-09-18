package Restoran;

import java.time.LocalDateTime;

public class ReservasiDemo {
    public static void main(String[] args) {
        Restaurant restoran = new Restaurant("Restoran ABC");

        Meja meja1 = new Meja(1, 4);
        Meja meja2 = new Meja(2, 6);
        
        // Add tables to the restaurant
        restoran.tambahkanMeja(meja1);
        restoran.tambahkanMeja(meja2);

        // Reservasi pertama (berhasil)
        Reservasi reservasi1 = new Reservasi(LocalDateTime.now(), "Budi", meja1, 2);
        meja1.reservasi(reservasi1);

        reservasi1.tampilkanInfo(); // Harus menampilkan pesan berhasil

        System.out.println("Jika pesan meja no 1 lagi");
        // Reservasi kedua (tidak berhasil, meja sudah terisi)
        Reservasi reservasi2 = new Reservasi(LocalDateTime.now(), "Sari", meja1, 4);
        meja1.reservasi(reservasi2); // This should fail

        System.out.println("==========================");

        // Cek ketersediaan semua meja dan tampilkan informasi reservasi
        for (Meja meja : restoran.getMeja()) {
            if (meja.isAvailable()) {
                System.out.println("Meja " + meja.getNomorMeja() + " tersedia.");
            } else {
                System.out.println("Meja " + meja.getNomorMeja() + " tidak tersedia.");
            }
        }
    }
}
