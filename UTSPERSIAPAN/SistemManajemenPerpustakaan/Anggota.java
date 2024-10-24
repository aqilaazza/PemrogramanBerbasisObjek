package UTS.SistemManajemenPerpustakaan;

import java.util.Date;

public class Anggota {
    private String nama;
    private String idAnggota;
    private Date tanggalDaftar;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setTanggal(Date tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public Date getTanggal() {
        return tanggalDaftar;
    }



}
