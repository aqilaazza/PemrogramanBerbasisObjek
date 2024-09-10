public class alatTulis{
    private String nama;
    private int stok, hargaSatuan, harga, totalHarga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok){
        this. stok = stok;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    
    
    public void setHarga() {
        this.harga = this.stok * this.hargaSatuan;
        this.totalHarga = this.harga;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public int getHargaSatuan(){
        return this.hargaSatuan;
    }

    public int getHarga() {
        return this.harga;
    }

    public int getTotalHarga() {
        return this.totalHarga;
    }


}