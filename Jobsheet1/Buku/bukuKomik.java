cNpackage Buku;

public class bukuKomik extends Buku {
    private String genre;
    private int jumlahVolume;

    public void setGenre (String newValues) {
        genre = newValues;
    }

    public String setGenre() {
        return genre;
    }

    public void ubahGenre(String genreBaru) {
        this.genre = genreBaru;
    }

    public void setJumlahVolume (int newValues) {
        jumlahVolume = newValues;
    }

    public int getJumlahVolume() {
        return jumlahVolume;
    }

    public void ubahJumlahVolume(int jumlahVolumeBaru) {
        this.jumlahVolume = jumlahVolumeBaru;
    }

    public void cekStatus() {
        super.cekStatus(); //sintaks memeanggi cetak status  dari kelas induk
        System.out.println("Genre :  " + genre);
        System.out.println("Genre : " + jumlahVolume);
    }

    
}
