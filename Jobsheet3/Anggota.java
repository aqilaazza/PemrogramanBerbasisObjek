package Jobsheet3;

public class Anggota {
    private String nama, ktp;
    private double limitPeminjaman, jumlahPeminjaman, angsuran;

    public Anggota(String ktp, String nama, double limitPeminjaman) {
        this.nama = nama;
        this.ktp = ktp;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPeminjaman = 0;
    }

    public String getNomorKTP() {
        return ktp;
    }

    public void setNomorKTP(String ktpValue) {
        this.ktp = ktpValue;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public void setLimitPeminjaman(double limitValues) {
        this.limitPeminjaman = limitValues;
    }

    public void setJumlahPeminjaman(double jumlahPeminjaman) {
        if (jumlahPeminjaman <= getLimitPeminjaman()) {
            this.jumlahPeminjaman = jumlahPeminjaman; 
        } else {
            System.out.println("Jumlah peminjaman melebihi batas");
        }
    }

    public double getJumlahPeminjaman() {
        return jumlahPeminjaman;
    }

    public void pinjam(double jumlahPeminjaman) { //menambahkan jumlah pinjaman yang diminta oleh anggota 
        if (jumlahPeminjaman <= limitPeminjaman - this.jumlahPeminjaman) { //memeriksa apakah jumlah pinjaman yang diajukan tidak melebihi sisa limit peminjaman
            this.jumlahPeminjaman += jumlahPeminjaman;
            System.out.println("Jumlah pinjaman berhasil: " + jumlahPeminjaman);
        } else {
            System.out.println("Maaf, jumlah peminjaman melebihi batas");
        }
    }

    public void bayarAngsuran(double angsuran) {
        if (angsuran > 0) {
            double minimumAngsuran = 10/100 * jumlahPeminjaman; // 10% dari jumlah pinjaman
            if (angsuran >= minimumAngsuran) {
                if (angsuran <= jumlahPeminjaman) {
                    this.jumlahPeminjaman -= angsuran;
                } else {
                    System.out.println("Angsuran melebihi jumlah pinjaman saat ini");
                }
            } else {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            }
        } else {
            System.out.println("Jumlah angsuran harus lebih besar dari 0");
        }
    }

}
