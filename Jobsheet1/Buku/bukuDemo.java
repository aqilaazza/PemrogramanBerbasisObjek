package Buku;

public class bukuDemo {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku ();
        buku1.setJudul("KBBI");
        buku1.setPengarang("Badan Pengembangan dan Pembinaan Bahasa, Kementerian Pendidikan dan Kebudayaan Republik Indonesia.");
        buku1.setPenerbit("Badan Pengembangan dan Pembinaan Bahasa, Kementerian Pendidikan dan Kebudayaan Republik Indonesia.");
        buku1.setTahun(2013);
        buku1.cekStatus();
        System.out.println("------ Setelah ubah tahun -----");
        buku1.ubahTahun(2016);
        buku1.cekStatus();

        System.out.println("===============================================");
        
        bukuNovel buku2 = new bukuNovel();
        buku2.setJudul("Tenggelamnya Kapal Van Der Wijk");
        buku2.setPengarang("Buya Hamka");
        buku2.setPenerbit("Balai Pustaka");
        buku2.setTahun(1939);
        buku2.setGenre("Action");
        buku2.cekStatus();
        System.out.println("------ Setelah ubah genre -----");
        buku2.ubahGenre("Romantic");
        buku2.cekStatus();

        
        System.out.println("===============================================");

        bukuKomik buku3 = new bukuKomik();
        buku3.setJudul("Avanger");
        buku3.setPengarang("Stan Lee dan Jack Kirby");
        buku3.setPenerbit("Marvel Comics");
        buku3.setTahun(1963);
        buku3.setGenre("Action");
        buku3.setJumlahVolume(9);
        buku3.cekStatus();
        System.out.println("-----Setelah ubah Jumlah Volume-----");
        buku3.ubahJumlahVolume(10);
        buku3.cekStatus();
        
    }
}
