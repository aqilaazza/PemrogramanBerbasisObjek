package Buku;

public class Buku {
    private String judul, pengarang, penerbit;
    private int tahun;

    public void setJudul(String newValues) {
        judul = newValues;
    }

    public void setPengarang(String newValues) {
        pengarang = newValues;
    }

    public void setPenerbit(String newValues) {
        penerbit = newValues;
    }

    public void setTahun(int newValues) {
        tahun = newValues;
    }

    public int getTahun() {
        return tahun;
    }

    public void ubahTahun(int tahunBaru) {
        this.tahun = tahunBaru;
    }

    public void cekStatus () {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun : " + tahun);

    }

}
