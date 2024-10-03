package Motor;

public class SepedaMotor {
    private String merekMotor;
    private Mesin mesin;

    public SepedaMotor (String merekMotor, String merekMesin) {
        this.merekMotor = merekMotor;
        this.mesin = new Mesin(); // Menginisialisasi objek Mesin
        this.mesin.setMerek(merekMesin);
    }
    
    public void setMerekMotor (String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor () {
        return merekMotor;
    }

    public String getMerekMesin () {
        return mesin.getMerek();
    }

    public void tambahKecepatanMotor() {
        mesin.tambahKecepatan();
    }

    public void kurangiKecepatanMotor() {
        mesin.kurangiKecepatan();
    }

}