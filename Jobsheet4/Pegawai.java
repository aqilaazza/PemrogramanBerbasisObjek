package Jobsheet4;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai (String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getnama() {
        return nama;
    }

    public void setNama() {
        this.nama = nama;
    }

    public String getinfo() {
        return nama + " (" + nip + ") ";
    }
}
