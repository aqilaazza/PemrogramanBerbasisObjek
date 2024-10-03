package Kerucut;

public class Kerucut {
    private double volume, luasPermukaan, r, t, s;
    private double phi = 3.14;

    public Kerucut () {
        this.r = 7;
        this.t = 10;
        this.s = 17;
    }

    public double hitungVolume () {
        volume = (1.0/3.0) * phi * r * r *t;
        return volume;
    }

    public double hitungLuasPermukaan () {
        luasPermukaan = phi * r * (s+r);
        return luasPermukaan;
    }

    public void tampilkanInfo() {
        System.out.println("Jari-jari alas kerucut : " + r + " cm");
        System.out.println("Tinggi kerucut  : " + t + " cm");
        System.out.println("Sisi miring kerucut : " + s + " cm");
        System.out.println("Volume kerucut : " + hitungVolume() + " cm3");
        System.out.println("Luas alas kerucut : " + hitungLuasPermukaan() + " cm2");
    }
}
