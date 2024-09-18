package Jobsheet4;

import java.util.ArrayList; //perintah dalam bahasa pemrograman Java yang digunakan untuk memasukkan kelas ArrayList dari paket java.util ke dalam program
import java.time.LocalDate;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi; //untuk menyimpan serangkaian objek bertipe konsultasi.

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama; 
    }

    public Pasien (String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>(); //Instansiasi untuk array baru menyimpan riwayat konsultasi
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis       : " + this.noRekamMedis + "\n";
        info += "Nama                 : " + this.nama + "\n";
        
        if(!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat konsultasi :\n";

            for(Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }
        info += "\n";

        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai Dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi ();

        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(Dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

}   


