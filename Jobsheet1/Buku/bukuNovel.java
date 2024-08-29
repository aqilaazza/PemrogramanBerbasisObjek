package Buku;

public class bukuNovel extends Buku {
    private String genre;

    public void setGenre (String newValues) {
        genre = newValues;
    }

    public String setGenre() {
        return genre;
    }

    public void ubahGenre(String genreBaru) {
        this.genre = genreBaru;
    }

    public void cekStatus() {
        super.cekStatus(); //sintaks memeanggi cetak status  dari kelas induk
        System.out.println("Genre " + genre);
    }
}
