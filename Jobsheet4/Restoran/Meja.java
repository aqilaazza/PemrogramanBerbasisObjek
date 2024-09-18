package Restoran;

import java.util.ArrayList;

public class Meja {
    private int noMeja;
    private int kursi;
    private ArrayList<Reservasi> riwayatReservasi;

    public Meja(int noMeja, int kursi) {
        this.noMeja = noMeja;
        this.kursi = kursi;
        this.riwayatReservasi = new ArrayList<>();
    }

    public boolean isAvailable() {
        return riwayatReservasi.isEmpty();
    }

    public void reservasi(Reservasi riwayatReservasi) {
        if (isAvailable()) {
            this.riwayatReservasi.add(riwayatReservasi);
            System.out.println("Reservasi berhasil dilakukan!");
        } else {
            System.out.println("Mohon maaf, meja tidak tersedia.");
        }
    }

    public ArrayList<Reservasi> getReservasi() {
        return riwayatReservasi;
    }

    public int getNomorMeja() {
        return noMeja;
    }

    public void setNomorMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public int getKursi() {
        return kursi;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    public String toString() {
        String info = "";
        info += "Meja{" +
               "noMeja=" + noMeja +
               ", kursi=" + kursi +
               '}';
        return info;
    }
}


