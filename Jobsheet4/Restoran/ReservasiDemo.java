package Restoran;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservasiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restoran = new Restaurant("Restoran ABC");

        int pilih;
            System.out.println("Welcome To " + restoran.getNama());
        do {
            System.out.println("\n============= Menu: =============");
            System.out.println("|| 1. Tambah Meja                ||");
            System.out.println("|| 2. Melakukan Reservasi        ||");
            System.out.println("|| 3. Tampilkan Ketersediaan Meja||");
            System.out.println("|| 4. Tampilkan Riwayat Reservasi||");
            System.out.println("|| 5. Keluar                     ||");
            System.out.println("===================================");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor meja: ");
                    int noMeja = sc.nextInt();
                    System.out.print("Masukkan tipe meja: "); // Update to ask for type
                    String tipeMeja = sc.next();
                    Meja mejaBaru = new Meja(noMeja, tipeMeja);
                    restoran.tambahkanMeja(mejaBaru);
                    System.out.println("Meja " + noMeja + " berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan nama tamu: ");
                    String namaTamu = sc.nextLine();
                    
                    for (Meja meja : restoran.getMeja()) {
                        if (meja.isAvailable()) {
                            System.out.println("Meja No." + meja.getNomorMeja() + " tersedia.");
                            System.out.println("Tipe Meja : " + meja.getTipeMeja());
                        } else {
                            System.out.println("Meja No." + meja.getNomorMeja() + " tidak tersedia.");
                        }
                    }
                    // Melakukan Reservasi
                    
                    System.out.print("Masukkan nomor meja untuk reservasi: ");
                    int mejaReservasi = sc.nextInt();
                    

                    Meja mejaPilihan = null;
                    for (Meja meja : restoran.getMeja()) {
                        if (meja.getNomorMeja() == mejaReservasi) {
                            mejaPilihan = meja;
                            break;
                        }
                    }

                    if (mejaPilihan != null) {
                        Reservasi reservasi = new Reservasi(LocalDateTime.now(), namaTamu, mejaPilihan);
                        mejaPilihan.reservasi(reservasi);
                    } else {
                        System.out.println("Meja tidak ditemukan.");
                    }
                    break;

                case 3:
                    // Tampilkan Ketersediaan Meja
                    for (Meja meja : restoran.getMeja()) {
                        if (meja.isAvailable()) {
                            System.out.println("Meja No." + meja.getNomorMeja() + " tersedia.");
                            System.out.println("Tipe Meja : " + meja.getTipeMeja());
                        } else {
                            System.out.println("Meja No." + meja.getNomorMeja() + " tidak tersedia.");
                        }
                    }
                    break;

                case 4 :
                // menampilkan riwayat reservasi
                for (Meja meja : restoran.getMeja()) {
                        System.out.println("Riwayat Reservasi Meja No." + meja.getNomorMeja() + ":");
                        ArrayList<Reservasi> reservasiList = meja.getReservasi();
                        if (reservasiList.isEmpty()) {
                            for (Reservasi reservasi : reservasiList) {
                                System.out.println("Nama Tamu: " + reservasi.getNamaTamu() +
                                                   ", Waktu: " + reservasi.getWaktuReservasi());
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terimakasih telah berkunjung.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilih != 5);

        sc.close();
    }
}
