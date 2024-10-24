package UTS.SistemManajemenSekolah;

public class Student extends Person {
    public String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Id student : " + studentId);
    }
}
