public class Balok {
    float panjang, lebar, tinggi;

    public Balok(float p, float l, float t) {
        panjang = p;
        lebar = l;
        tinggi = t;

    }

    public float hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public float hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public void infoBalok() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Volume Balok: " + hitungVolume());
        System.out.println("Luas Permukaan Balok: " + hitungLuasPermukaan());

    }


    public static void main(String[] args) {
        Balok balok1 = new Balok(4.4f, 2.5f, 3.3f);
        balok1.infoBalok();
        Balok balok2 = new Balok(9.0f,7.0f, 8.0f);
        balok2.infoBalok();
        

    }
}