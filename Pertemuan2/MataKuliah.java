public class MataKuliah {
        private int idMatkul;
        private String namaMatkul;
        private int sks;
        private String jadwal;
    
        public MataKuliah(int idMatkul, String namaMatkul, int sks, String jadwal) {
            this.idMatkul = idMatkul;
            this.namaMatkul = namaMatkul;
            this.sks = sks;
            this.jadwal = jadwal;
        }
    
        public void tampilkanMatkul() {
            System.out.println("ID Mata Kuliah: " + idMatkul);
            System.out.println("Nama Mata Kuliah: " + namaMatkul);
            System.out.println("SKS: " + sks);
            System.out.println("Jadwal: " + jadwal);
        }

        public void tambahMatkul(int idMatkul, String namaMatkul, int sks, String jadwal) {
            this.idMatkul = idMatkul;
            this.namaMatkul = namaMatkul;
            this.sks = sks;
            this.jadwal = jadwal;
        }
    
        public int tambahSks(int increment) {
            sks += increment;
            return sks;
        }
    
        public void tampilkanJadwal() {
            System.out.println("Jadwal Mata Kuliah: " + jadwal);
        }
    
        public void ubahJadwal(String jadwalBaru) {
            jadwal = jadwalBaru;
        }

       
        public static void main(String[] args) {
            MataKuliah matkul = new MataKuliah(101, "Pemrograman Java", 3, "Senin 08:00-10:00");
    
            matkul.tampilkanMatkul();
            matkul.tampilkanJadwal();
    
            System.out.println("\nMenambah SKS 2:");
            matkul.tambahSks(2);
            matkul.tampilkanMatkul();
    
            System.out.println("\nMengubah jadwal menjadi Rabu 10:00-12:00:");
            matkul.ubahJadwal("Rabu 10:00-12:00");
            matkul.tampilkanJadwal();
        }
    }