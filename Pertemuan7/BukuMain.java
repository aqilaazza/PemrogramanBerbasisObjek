public class BukuMain {
    public static void main(String[] args) {
                // Membuat objek dari kelas Buku
                Buku bukuUmum = new Buku(
                    "Pemrograman Java", 
                    "Azza", 
                    "Informatika Publisher", 
                    2020, 
                    "978-602-9342-23-9", 
                    400, 
                    120000
                );
                
                // Membuat objek dari kelas BukuKomik
                BukuKomik bukuKomik = new BukuKomik(
                    "One Piece", 
                    "Eiichiro Oda", 
                    "Shueisha", 
                    1997, 
                    "978-408-8726-19-2", 
                    200, 
                    50000, 
                    "Aksi", 
                    "Petualangan", 
                    "Eiichiro Oda", 
                    100
                );
                
                // Membuat objek dari kelas BukuNovel
                BukuNovel bukuNovel = new BukuNovel(
                    "Laskar Pelangi", 
                    "Andrea Hirata", 
                    "Bentang Pustaka", 
                    2005, 
                    "978-979-1228-22-6", 
                    529, 
                    85000, 
                    "Inspiratif"
                );
                
                // Memanggil metode deskripsiBuku untuk setiap objek
                bukuUmum.deskripsiBuku();
                System.out.println("\n");
                bukuKomik.deskripsiBuku();
                System.out.println("\n");
                bukuNovel.deskripsiBuku();
        
     }
}
