package Jobsheet3;

public class TesKoprasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota ("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota : " + anggota1.getNama());
        System.out.println("Limit Peminjaman : " + anggota1.getLimitPeminjaman());

        System.out.println("====================================");

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.setJumlahPeminjaman(10000000); // melebihi limit
        System.out.println("Jumlah peminjaman saat ini : " + anggota1.getJumlahPeminjaman());

        System.out.println("====================================");

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.setJumlahPeminjaman(4000000);
        System.out.println("Jumlah peminjaman saat ini : " + anggota1.getJumlahPeminjaman());

        
        System.out.println("====================================");

        System.out.println("\nMembayar angsuran sebesar 1.000.000");
        anggota1.bayarAngsuran(1000000);
        System.out.println("Jumlah pinjaman saat ini : " + anggota1.getJumlahPeminjaman());

        
        System.out.println("====================================");

        System.out.println("\nMembayar angsuran sebesar 3.000.000");
        anggota1.bayarAngsuran(3000000);
        System.out.println("Jumlah pinjaman saat ini : " + anggota1.getJumlahPeminjaman());

    }
    
}
