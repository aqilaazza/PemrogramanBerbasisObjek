public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih() {
      return hargaKotor - diskon * hargaKotor; 
    }

    public void displayInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Harga kotor : " + hargaKotor);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harga bersih : " + getHargaBersih());
    }
}