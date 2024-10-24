package UTS;

public class PemegangSaham extends Manajer {
    private int deviden;
    private int saham;

    public void setDeviden(int deviden) {
        this.deviden = deviden;
    }

    public void setSaham(int saham) {
        this.saham = saham;
    }

    public int getDeviden() {
        return deviden;
    }

    public int getSaham() {
        return saham;
    }

    public void tampilDataPemegangSaham(Manajer manajer) {
        System.out.println("Deviden: " + getDeviden());
        System.out.println("Jumlah Saham: " + getSaham());
        int totalGaji = manajer.getTotalGaji() + deviden;
        System.out.println("Total Gaji (Manajer + Deviden): " + totalGaji);
    }
}
