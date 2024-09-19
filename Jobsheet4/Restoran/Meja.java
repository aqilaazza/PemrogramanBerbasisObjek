package Restoran;

import java.util.ArrayList;

public class Meja {
    private int noMeja;
    private String tipeMeja;
    private ArrayList<Reservasi> riwayatReservasi;

    public Meja(int noMeja, String tipeMeja) {
        this.noMeja = noMeja;
        this.tipeMeja = tipeMeja;
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

    public String getTipeMeja() {
        return tipeMeja;
    }

    public void setTipeMeja(String tipeMeja) {
        this.tipeMeja = tipeMeja;
    }
}


