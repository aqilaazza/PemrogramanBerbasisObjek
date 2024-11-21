package Kuiz2;

public abstract class Dosen {
    protected String nama;

    public Dosen (String nama) {
        this.nama = nama;
    }

    public abstract String getInfoDosen();
}
