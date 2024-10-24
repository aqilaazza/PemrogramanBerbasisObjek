package UTS.SistemManajemenPerpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean status = true;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean getStatus() {
        return status;
    }

    public void pinjam(String namaAnggota) {
        if (this.status) {
            this.status = false; // ubah tidak tersedia
            System.out.println("Buku '" + this.judul + "' berhasil dipinjam oleh " + namaAnggota);
        } else {
            System.out.println("Buku '" + this.judul + "' tidak tersedia untuk dipinjam.");
        }
    }

    public void kembalikan() {
        if (!this.status) {
            this.status = true; // ubah tersedia
            System.out.println("Buku '" + this.judul + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku '" + this.judul + "' tidak berhasil dikembalikan.");
        }
    }
}
