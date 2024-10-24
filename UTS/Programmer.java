package UTS;

public class Programmer extends Pegawai {
    private int bonus;

    public void setBonus (int bonus) {
        this.bonus = bonus;
    }

    public int getBonus () {
        return bonus;
    }

    public void tampilDataProgrammer () {
        super.tampilDataPokokPegawai();
        System.out.println("Bonus : " + getBonus());
    }
}
