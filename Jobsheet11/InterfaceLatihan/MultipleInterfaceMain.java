package Jobsheet11.InterfaceLatihan;

public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatMawapresNasional(masterCum);
        pakRektor.beriSertifikatMawapresInternasional(masterCum);



    }
    
}
