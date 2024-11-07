package Jobsheet11.InterfaceTugas;

public class Keledai extends Binatang implements IHerbivora{

    private String suara;
    private String warnaBulu;

    public Keledai (String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis : Herbivora");
        System.out.println("Makanan : Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
        System.out.println("Suara : " +  suara);
        System.out.println("Warna : " + warnaBulu);
    }

    public void displayData() {
        displayMakanan();
        displayBinatang();
    }
}
