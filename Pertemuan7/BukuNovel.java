public class BukuNovel extends Buku {
   private String genre;

   public BukuNovel (String judul, String penulis, String penerbit, int tahunTerbit, String isbn, 
   int jumlahHalaman, double harga, String genre) {
    super(judul, penulis, penerbit, tahunTerbit, isbn, jumlahHalaman, harga);
        this.genre = genre;
   }

   public void deskripsiBuku () {
        super.deskripsiBuku();
        System.out.println("Genre novel : " + genre)  ;
   }

}

