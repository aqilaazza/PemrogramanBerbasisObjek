public class SewaBuku {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Tenggelamnya kapan van der wijk", "Buya Hamka");

        Anggota anggota1 = new Anggota("Aqila Nur Azza", 01);

        anggota1.sewaBuku(buku1);
        anggota1.kembalikanBuku(buku1);
        anggota1.sewaBuku(buku1);
    }
}
