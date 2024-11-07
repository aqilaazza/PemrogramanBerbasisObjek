package Jobsheet11.InterfaceTugas;

public class BinatangMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
    Gorila gorila = new Gorila("Gulali", 4, "Haaum Hauum", "Hitam Manis");
    Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

    System.out.println("Data Keledai:");
    keledai.displayData();
    System.out.println();

    System.out.println("Data Gorilla:");
    gorila.displayData();
    System.out.println();

    System.out.println("Data Singa:");
    singa.displayData();
    }
}
