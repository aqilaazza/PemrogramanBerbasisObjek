package UTS;

public class PegawaiMain {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        manajer.setNoIndukPegawai("001");
        manajer.setNama("Drogba");
        manajer.gaji = 100000;
        manajer.setTunjanganJabatan(50000);
        System.out.println("Data Manajer:");
        manajer.tampilDataManajer();

        PemegangSaham pemegangSaham = new PemegangSaham();
        pemegangSaham.setDeviden(1000);
        pemegangSaham.setSaham(10);
        pemegangSaham.tampilDataPemegangSaham(manajer);
    }
    
}
