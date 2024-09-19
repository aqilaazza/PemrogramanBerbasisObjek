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
}