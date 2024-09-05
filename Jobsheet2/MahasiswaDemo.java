public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023442";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatra Utara";
        m1.kelas = "2A";

        m1.displayBiodata();

        System.out.println("=====================");

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "2341760022";
        m2.nama = "Aqila Nur Azza";
        m2.alamat = "Kediri, Jawa Timur";
        m2.kelas = "2A";

        m2.displayBiodata();

        System.out.println("=====================");

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "2341760024";
        m3.nama = "Meisy Nadia";
        m3.alamat = "Batam, Kepulauan Riau";
        m3.kelas = "2c";

        m3.displayBiodata();

    }
}
