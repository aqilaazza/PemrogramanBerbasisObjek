package Kendaraan;

public class kendaraanMobil extends Kendaraan {
    private int jumlahPintu;
    private String tipeMesin;
    private double bensin;

    public void setJumlahPintu(int newValue) {
        jumlahPintu = newValue; 
    }

    public void setTipeMesin(String newValue) {
        tipeMesin = newValue; 
    }

    public void setKapasitasBensin(double newValue) {
        bensin = newValue; 
    }

    public void bukaPintu() {
        System.out.println("Pintu mobil dibuka");
    }

    public void cetakStatus() {
        super.cetakStatus(); //sintaks memeanggi cetak status  dari kelas induk
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Tipe mesin : " + tipeMesin);
        System.out.println("Kapasitas bensin : " + bensin + "Liter");
    }

}
