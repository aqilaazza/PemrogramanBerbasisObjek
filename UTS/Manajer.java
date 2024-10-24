package UTS;

public class Manajer extends Pegawai {
    private int tunjanganJabatan;
    public int totalGaji;


    public void setTunjanganJabatan (int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public int getTotalGaji () {
        return totalGaji = gaji + tunjanganJabatan;
    }

    public void tampilDataManajer () {
        super.tampilDataPokokPegawai();
        System.out.println("Tunjangan Jabatan : " + getTunjanganJabatan());
        System.out.println("Total Gaji : " + getTotalGaji());
    }
}
