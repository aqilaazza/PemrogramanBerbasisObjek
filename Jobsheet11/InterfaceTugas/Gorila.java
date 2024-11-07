package Jobsheet11.InterfaceTugas;

public class Gorila extends Binatang implements IHerbivora, IKarnivora  {
    private String suara;
    private String warnaBulu;

    public Gorila(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis :  herbivora + karnivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    public void displayData() {
        displayMakanan();
        displayBinatang();
    }
}
