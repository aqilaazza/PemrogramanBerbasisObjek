package Kendaraan;

public class kendaraanMotor extends Kendaraan {
    private int jumlahRoda;
    private String tipeMesin;
    private double bensin;
    private boolean memilikiBoksSamping;

    public void setJumlahRoda(int newValue) {
        jumlahRoda = newValue; 
    }

    public void setTipeMesin(String newValue) {
        tipeMesin = newValue; 
    }

    public void setKapasitasBensin(double newValue) {
        bensin = newValue; 
    }

    public void setMemilikiBoksSamping(boolean memilikiBoksSamping) {
        this.memilikiBoksSamping = memilikiBoksSamping;
    }

    public boolean isMemilikiBoksSamping() {
        return memilikiBoksSamping;
    }

    public void bukaBoksSamping() {
        if (memilikiBoksSamping) {
            System.out.println("Buka Boks Samping");
        } else {
            System.out.println("Tidak memiliki Boks Samping");
        }
    }

    public void tutupBoksSamping() {
        if (memilikiBoksSamping) {
            System.out.println("Tutup Boks Samping");
        } else {
            System.out.println("Tidak memiliki Boks Samping");
        }
    }

    public void cekStatus() {
    super.cetakStatus(); //sintaks memeanggi cetak status  dari kelas induk
    System.out.println("Jumlah Roda: " + jumlahRoda);
    System.out.println("Tipe mesin : " + tipeMesin);
    System.out.println("Kapasitas bensin : " + bensin +" Liter");
    System.out.println("Memiliki Boks Samping: " + (memilikiBoksSamping ? "Ya" : "Tidak"));
    
    }
}
