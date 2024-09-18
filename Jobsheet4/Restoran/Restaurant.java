package Restoran;

import java.util.ArrayList;

public class Restaurant {
    private String nama;
    private ArrayList<Meja> meja;

    public Restaurant(String nama) {
        this.nama = nama;
        this.meja = new ArrayList<>();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tambahkanMeja(Meja meja) {
        this.meja.add(meja);
    }
    
    public ArrayList<Meja> getMeja() {
        return meja;
    }
    
    public void tampilkanMeja() {
        if (meja.isEmpty()) {
            System.out.println("Tidak ada meja yang tersedia.");
        } else {
            System.out.println("Daftar Meja:");
            for (Meja m : meja) {
                System.out.println(m);
            }
        }
    }
}
