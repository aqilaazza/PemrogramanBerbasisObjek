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

    public void beriSertifikatMawapresInternasional(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES. ");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi? ");
        mahasiswa.menjuaraiKompetisiInternasional();
        mahasiswa.membuatPublikasiIlmiahInternasional();
        

        System.out.println("----------------------------------------------------");
    }

    public void beriSertifikatMawapresNasional(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES. ");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi? ");
        mahasiswa.menjuaraiKompetisiNasional();
        mahasiswa.membuatPublikasiIlmiahNasional();
        

        System.out.println("----------------------------------------------------");
    }
}
