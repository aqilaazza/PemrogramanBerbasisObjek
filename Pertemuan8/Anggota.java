public class Anggota {
    private String namaAnggota;
    private int id;

    public Anggota (String namaAnggota, int id) {
        this.namaAnggota =namaAnggota;
        this.id = id;
    }

    public String getNama() {
        return namaAnggota;
    }

    public int getId() {
        return id;
    }

    public void sewaBuku(Buku buku) {
        System.out.println("Anggota '" + getNama() + "' berhasil menyewa buku '" + buku.getJudul() + "'");
    }

    public void kembalikanBuku(Buku buku) {
        System.out.println("Anggota '" + getNama() + "' mengembalikan buku '" + buku.getJudul() + "'");

    }
}
