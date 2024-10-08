package Jobsheet3;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat nomor : " + this.platNomor);

        if(isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("=============================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn (boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn) { // jika tidak nyala
            if (kecepatan > 0) {
                System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            } else {
                System.out.println("Mesin off");
            }
        } else if (kecepatan > 100) {
            System.out.println("Maksimal kecepatan tidak boleh lebih dari 100 jika mesin on");
        } else if (kecepatan < 0) { 
            System.out.println("Nilai kecepatan tidak boleh negatif dan harus lebih dari nol");
        }else {
            this.kecepatan = kecepatan;
        }
    }


}
