package Jobsheet11.InterfaceLatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude. ");
        System.out.println("Selamat! silahkan perkenalkan diri anda.. ");
        mahasiswa.kuliahDikampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("----------------------------------------------------");
    }
}
