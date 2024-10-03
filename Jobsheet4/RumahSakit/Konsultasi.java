package Jobsheet4;
import java.time.LocalDate; //untuk mendeklarasi atribut tanggal

public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal (LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai getDokter() {
        return dokter;
    }

    public void setDokter (Pegawai dokter) {
        this.dokter = dokter;
    }

    public Pegawai getPerawat () {
        return perawat;
    }

    public void setPerawat (Pegawai perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal : " + tanggal;
        info += ", Dokter : " + dokter.getinfo();
        info += ", Perawat : " + perawat.getinfo();
        info += "\n";

        return info;
    }

}


