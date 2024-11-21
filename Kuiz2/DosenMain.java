package Kuiz2;

public class DosenMain {
    public static void main(String[] args) {
        DosenKontrak dosen1 = new DosenKontrak("Angelina Nur Azza", 12);
        DosenPns dosen2 = new DosenPns("Aqila Nur Azza", 5000000);

        System.out.println(dosen1.getInfoDosen());
        System.out.println("===============================");
        System.out.println(dosen2.getInfoDosen());
    }
}
