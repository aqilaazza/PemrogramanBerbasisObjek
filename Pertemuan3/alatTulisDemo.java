public class alatTulisDemo {
    public static void main(String[] args) {
        alatTulis bolpoint = new alatTulis();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);
        bolpoint.setHarga();
        System.out.println("Nama Barang  : " + bolpoint.getNama());
        System.out.println("Stok : " + bolpoint.getStok());
        System.out.println("Harga Satuan : " + bolpoint.getHargaSatuan());
        System.out.println("Total semua : " + bolpoint.getTotalHarga());

        System.out.println("==================================");

        alatTulis pensil = new alatTulis();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);
        pensil.setHarga();
        System.out.println("Nama Barang : " + pensil.getNama());
        System.out.println("Stok  : " + pensil.getStok());
        System.out.println("Harga Satuan : " + pensil.getHargaSatuan());
        System.out.println("Total Semua : " + pensil.getTotalHarga());

        System.out.println("==================================");
        
        alatTulis penghapus = new alatTulis();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);
        penghapus.setHarga();
        System.out.println("Nama Barang : " + penghapus.getNama());
        System.out.println("Stok  : " + penghapus.getStok());
        System.out.println("Harga Satuan : " + penghapus.getHargaSatuan());
        System.out.println("Total Semua : " + penghapus.getTotalHarga());

        System.out.println("==================================");

        System.out.println("Total Semua Barang : " + (bolpoint.getTotalHarga() + pensil.getTotalHarga() + penghapus.getTotalHarga()));
    }
}