package SepedaDemo;

public class SepedaGunung extends Sepeda { //menunjukkan Sepeda Gunung mewarisi class sepeda
    
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue; //memberi nilai
    }

    public void cetakStatus() {
        super.cetakStatus(); //sintaks memeanggi cetak status  dari kelas induk
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
