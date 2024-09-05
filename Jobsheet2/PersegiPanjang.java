public class PersegiPanjang {
    public int panjang, lebar;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void diplayInfo() {
        System.out.println("-- Informasi Persegi Panjang --");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + (" cm"));
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public void cetakLuas() {
        System.out.println("Luas Persegi Panjang adalah " + getLuas() + (" cm"));
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void cetakKeliling() {
        System.out.println("Keliling Persegi Panjang adalah " + getKeliling() + (" cm"));
    }
}