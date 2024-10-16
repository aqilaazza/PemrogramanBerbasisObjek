public class Buku {
    protected String judul;
    protected String penulis;
    protected String penerbit;
    protected int tahunTerbit;
    protected String isbn;
    protected int jumlahHalaman;
    protected double harga;

    public Buku(String judul, String penulis, String penerbit, int tahunTerbit, String isbn, int jumlahHalaman, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.isbn = isbn;
        this. jumlahHalaman = jumlahHalaman; 
        this.harga = harga;
    }

    public void deskripsiBuku() {
        System.out.println("==== Deskripsi Buku ====");
        System.out.println("Judul Buku : " + judul);
        System.out.println("Nama pengarang buku : " + penulis);
        System.out.println("Penerbit buku : " + penerbit);
        System.out.println("Tahun terbit : " + tahunTerbit);
        System.out.println("ISBN : " + isbn);
        System.out.println("Jumlah Halaman Buku : " + jumlahHalaman);
        System.out.println("Harga buku : " + harga);
    }
}