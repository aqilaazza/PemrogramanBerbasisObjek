package Kuiz2;

public class DosenPns extends Dosen implements iPembayaran{
    private int gaji;

    public DosenPns(String nama, int gaji) {
        super(nama);
        this.gaji = gaji;
    }

    public void setGaji (int gaji) {
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public int getJumlahPembayaran () {
        return gaji;
    }

    public String getInfoDosen() {
        return "Status            : Dosen PNS\n" +
        "Nama              : " + nama + "\n" +
        "Gaji              : Rp" + getGaji() + "\n" +
        "Jumlah pembayaran : Rp" + getJumlahPembayaran();

    }
}
