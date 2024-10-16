package Jobsheet8;

public class ManusiaMain {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        System.out.println("== Manusia ==");
        manusia.bernafas();
        manusia.makan();

        Dosen dosen = new Dosen();
        System.out.println("== Dosen ==");
        dosen.makan();
        dosen.lembur();

        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("== Mahasiswa ==");
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
