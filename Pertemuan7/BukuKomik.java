public class BukuKomik extends Buku {
    private String genre;
    private String subGenre;
    private String ilustrator;
    private int volume;

    public BukuKomik(String judul, String penulis, String penerbit, int tahunTerbit, String isbn, 
                    int jumlahHalaman, double harga, String genre, String subGenre, String ilustrator, int volume) {
        super(judul, penulis, penerbit, tahunTerbit, isbn, jumlahHalaman, harga);
        this.genre = genre;
        this.subGenre = subGenre;
        this.ilustrator = ilustrator;
        this.volume = volume;
    }

    public void deskripsiBuku() {
        super.deskripsiBuku();
        System.out.println("Genre Komik : " + genre);
        System.out.println("Sub-genre Komik : " + subGenre);
        System.out.println("Ilustrator : " + ilustrator);
        System.out.println("Jumlah Volume : " + volume);
    }

}