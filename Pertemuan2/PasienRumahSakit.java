public class PasienRumahSakit {
        private String nama;
        private String alamat;
        private int umur;
        private String jenisKelamin;
        private String noHandphone;
    
        public PasienRumahSakit(String nama, String alamat, int umur, String jenisKelamin, String noHandphone) {
            this.nama = nama;
            this.alamat = alamat;
            this.umur = umur;
            this.jenisKelamin = jenisKelamin;
            this.noHandphone = noHandphone;
        }
    
        public void membuatAntrian() {
            System.out.println("Antrian dibuat untuk pasien: " + nama);
        }
    
        public void membuatJanjiDokter() {
            System.out.println("Janji dokter dibuat untuk pasien: " + nama);
        }
    
        public void membayarTagihan() {
            System.out.println("Tagihan dibayar untuk pasien: " + nama);
        }
    
        public void tampilkanRiwayatMedis() {
            System.out.println("Riwayat medis untuk pasien: " + nama);

        }
    

        public void cetakInfoPasien() {
            System.out.println("Biodata Pasien:");
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat );
            System.out.println("Umur: " + umur);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.println("Nomor Handphone: " + noHandphone); 
        }

        public static void main(String[] args) {
            
            PasienRumahSakit pasien1 = new PasienRumahSakit("Aqila", "Jl. Simpang Remujung no. 03", 19, "Perempuan", "081230382286");
    
            pasien1.cetakInfoPasien();
            pasien1.membuatAntrian();
            pasien1.membuatJanjiDokter();
            pasien1.membayarTagihan();
            pasien1.tampilkanRiwayatMedis();
    }
    }
    
