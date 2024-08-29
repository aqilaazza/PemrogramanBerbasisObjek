package Kendaraan;

public class Kendaraan {
    private String merek, model, warna;
    private int tahun;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setModel(String newValue) {
        model = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setTahun(int newValue) {
        tahun = newValue;
    }

    public void nyalakan() {
        System.out.println("Kendaraan on");
    }

    public void berhenti() {
        System.out.println("Kendraan off");
    }

    public void cetakStatus() {
       System.out.println("Merek : " + merek);
       System.out.println("Model : " + model);
       System.out.println("Warna : " + warna);
       System.out.println("Tahun : " + tahun);
    }
}
