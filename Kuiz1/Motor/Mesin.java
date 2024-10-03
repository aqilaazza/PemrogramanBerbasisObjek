package Motor;

public class Mesin {
    private String merek;
    private double kecepatan;

    public Mesin() {
        this.kecepatan = 0;
    }

    public void setMerek (String merekMesin) {
        this.merek = merekMesin;
    }

    public String getMerek () {
        return merek;
    }

    public void tambahKecepatan() {
        if (merek.equalsIgnoreCase("Honda")) {
            kecepatan += 10;
        } else if (merek.equalsIgnoreCase("Yamaha")) {
            kecepatan += 15;
        }
        if (kecepatan > 100) {
            kecepatan = 100; //kecepatan tidak boleh lebih dari 100, jika kecepatan lebih dari 100 maka akan dianggap 100
        }
        System.out.println(kecepatan + " Km/jam"); 
    }

    public void kurangiKecepatan() {
        if (merek.equalsIgnoreCase("Honda")) {
            kecepatan -= 5;
        } else if (merek.equalsIgnoreCase("Yamaha")) {
            kecepatan -= 10;
        }
        if (kecepatan < 0) {
            kecepatan = 0; // kecepatan tidak boleh kurang dari 0, maka kecepatan akan dianggap 0
        }
        System.out.println(kecepatan + " Km/jam"); 
    }


}
