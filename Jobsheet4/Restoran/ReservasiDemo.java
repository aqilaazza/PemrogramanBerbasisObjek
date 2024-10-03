package Restoran;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservasiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restoran = new Restaurant("Restoran ABC");
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        int pilih;
        System.out.println("Welcome To " + restoran.getNama());
        do {
            System.out.println("\n============= Menu: =============");
            System.out.println("|| 1. Tambah Meja                ||");
            System.out.println("|| 2. Melakukan Reservasi        ||");
            System.out.println("|| 3. Tampilkan Ketersediaan Meja||");
            System.out.println("|| 4. Tampilkan Riwayat Reservasi||");
            System.out.println("|| 5. Tambah Menu Item           ||");
            System.out.println("|| 6. Tampilkan Menu              ||");
            System.out.println("|| 7. Keluar                     ||");
            System.out.println("===================================");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor meja: ");
                    int noMeja = sc.nextInt();
                    System.out.print("Masukkan tipe meja: ");
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
                    for (Meja meja : restoran.getMeja()) {
                        if (meja.isAvailable()) {
                            System.out.println("Meja No." + meja.getNomorMeja() + " tersedia.");
                            System.out.println("Tipe Meja : " + meja.getTipeMeja());
                        } else {
                            System.out.println("Meja No." + meja.getNomorMeja() + " tidak tersedia.");
                        }
                    }
                    break;

                case 4:
                    for (Meja meja : restoran.getMeja()) {
                        System.out.println("Riwayat Reservasi Meja No." + meja.getNomorMeja() + ":");
                        ArrayList<Reservasi> reservasiList = meja.getReservasi();
                        if (!reservasiList.isEmpty()) {
                            for (Reservasi reservasi : reservasiList) {
                                System.out.println("Nama Tamu: " + reservasi.getNamaTamu() +
                                                   ", Waktu: " + reservasi.getWaktuReservasi());
                            }
                        } else {
                            System.out.println("Tidak ada reservasi.");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Masukkan nama menu item: ");
                    String namaMenu = sc.nextLine();
                    System.out.print("Masukkan harga menu item: ");
                    double hargaMenu = sc.nextDouble();
                    System.out.print("Masukkan kategori menu item: ");
                    String kategoriMenu = sc.next();
                    MenuItem menuItemBaru = new MenuItem(namaMenu, hargaMenu, kategoriMenu);
                    menuItems.add(menuItemBaru);
                    System.out.println("Menu item " + namaMenu + " berhasil ditambahkan.");
                    break;

                case 6:
                    System.out.println("Menu Item yang Tersedia:");
                    for (MenuItem item : menuItems) {
                        System.out.println(item);
                    }
                    break;

                case 7:
                    System.out.println("Terimakasih telah berkunjung.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilih != 7);

        sc.close();
    }
}
