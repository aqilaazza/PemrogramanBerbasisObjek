public class Buku {
    private String judul;
    private String penulis;
    public boolean tersedia = true;

    public Buku (String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }


    public void sewaBuku() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku " + getJudul() + " berhasil disewa.");
        } else {
            System.out.println("Buku " + getJudul() + " sedang tidak tersedia.");
        }
    }

    public void kembalikanBuku() {
        tersedia = true;
        System.out.println("Buku " + getJudul() + " berhasil dikembalikan.");
    }

}