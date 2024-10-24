package UTS.SistemManajemenSekolah;

public class Teacher extends Person{
    public String employeeId;

    public Teacher(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Id Pegawai : " + employeeId);
    }
}
