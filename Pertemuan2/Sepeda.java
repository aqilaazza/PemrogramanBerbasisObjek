public class Sepeda {
        private String merek;
        private String warna;
        private float kecepatan;
        private int gear;
    
        public Sepeda(String merek, String warna, float kecepatan, int gear) {
            this.merek = merek;
            this.warna = warna;
            this.kecepatan = kecepatan;
            this.gear = gear;
        }
    
        public float tambahKecepatan(float increment) {
            this.kecepatan += increment;
            return this.kecepatan;
        }
    
        public float kurangiKecepatan(float decrement) {
            this.kecepatan -= decrement;
            if (this.kecepatan < 0) {
                this.kecepatan = 0; // Pastikan kecepatan tidak negatif
            }
            return this.kecepatan;
        }
    
        public void ubahGear(int gear) {
            this.gear = gear;
        }
    
    
        public void setGear(int gear) {
            this.gear = gear;
        }

        public void cetakInfo() {
            System.out.println("Informasi Sepeda:");
            System.out.println("Merek: " + merek);
            System.out.println("Warna: " + warna);
            System.out.println("Kecepatan: " + kecepatan);
            System.out.println("Gear: " + gear);
        }
    

        public static void main(String[] args) {
            Sepeda sepeda = new Sepeda("Polygon", "Merah", 0.0f, 1);
    
            sepeda.cetakInfo();
            
            System.out.println("\nMenambah kecepatan 15.0:");
            sepeda.tambahKecepatan(15.0f);
            sepeda.cetakInfo();
    
            System.out.println("\nMengurangi kecepatan 5.0:");
            sepeda.kurangiKecepatan(5.0f);
            sepeda.cetakInfo();
    
            System.out.println("\nMengubah gear menjadi 3:");
            sepeda.ubahGear(3);
            sepeda.cetakInfo();
        }
    }
    
