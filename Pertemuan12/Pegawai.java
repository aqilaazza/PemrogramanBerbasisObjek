public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai () {
        this.nama = "nama tidak diketahui";
        this.gaji = 0;
    }

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}
