package Jobsheet8;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int sudutSisa1 = segitiga.totalSudut(60);
        System.out.println("Sudut yang tersisa: " + sudutSisa1);

        int sudutSisa2 = segitiga.totalSudut(60, 50);
        System.out.println("Sudut yang tersisa: " + sudutSisa2);

        // Contoh penggunaan keliling dengan 3 sisi
        int kelilingSegitiga1 = segitiga.keliling(3, 4, 5);
        System.out.println("Keliling segitiga dengan tiga sisi: " + kelilingSegitiga1);

        // Contoh penggunaan keliling dengan 2 sisi (menggunakan Pythagoras)
        double kelilingSegitiga2 = segitiga.keliling(3, 4);
        System.out.println("Keliling segitiga (pythagoras): " + kelilingSegitiga2);
    }
}
