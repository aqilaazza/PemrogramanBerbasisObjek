package Kendaraan;

public class KendaraanDemo {
    public static void main(String[] args) {
        
        Kendaraan kdr1 = new Kendaraan();
        kdr1.setMerek("Polygon");
        kdr1.setModel("Sepeda Gunung");
        kdr1.setWarna("Putih");
        kdr1.setTahun(2016);

        kdr1.cetakStatus();
        kdr1.nyalakan();
        kdr1.berhenti();

        System.out.println("----------------------------------");

        kendaraanMobil kdr2 = new kendaraanMobil();
        kdr2.setMerek("Honda");
        kdr2.setModel("Brio");
        kdr2.setWarna("Kuning");
        kdr2.setTahun(2024);
        kdr2.setJumlahPintu(4);
        kdr2.setTipeMesin("VTEC");
        kdr2.setKapasitasBensin(35);

        kdr2.cetakStatus();
        kdr2.bukaPintu();
        kdr2.nyalakan();

        System.out.println("----------------------------------");
        
        kendaraanMotor kdr3 = new kendaraanMotor();
        kdr3.setMerek("Honda");
        kdr3.setModel("Vario 125");
        kdr3.setWarna("Merah");
        kdr3.setTahun(2015);
        kdr3.setJumlahRoda(2);
        kdr3.setTipeMesin("4-tak, SOHC");
        kdr3.setKapasitasBensin(5.5);
        kdr3.setMemilikiBoksSamping(true);
    

        kdr3.cekStatus();
        kdr3.bukaBoksSamping();
        kdr3.tutupBoksSamping();

        



    }
}
