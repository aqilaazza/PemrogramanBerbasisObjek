package UTS; 

public class Pegawai {
    private String noIndukPegawai;
    private String nama;
    public int gaji;

    public void setNoIndukPegawai (String noIndukPegawai) {
        this.noIndukPegawai = noIndukPegawai;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public String getNoIndukPegawai () {
        return noIndukPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void tampilDataPokokPegawai () {
        System.out.println("Nomor Induk Pegawai : " + getNoIndukPegawai());
        System.out.println("Nama Pegawai : " + getNama() );
        System.out.println("Gaji : " + gaji);
    }
}