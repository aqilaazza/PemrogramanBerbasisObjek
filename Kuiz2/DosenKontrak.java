package Kuiz2;

public class DosenKontrak extends Dosen {
    private int lamaKontrak;

    public DosenKontrak(String nama, int lamaKontrak) {
        super(nama);
        this.lamaKontrak = lamaKontrak;
    }

    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public String getInfoDosen() {
        return "Status       : Dosen Kontrak\n" +
        "Nama         : " + nama + "\n" +
        "Lama kontrak : " + lamaKontrak + " bulan";
    }
}
