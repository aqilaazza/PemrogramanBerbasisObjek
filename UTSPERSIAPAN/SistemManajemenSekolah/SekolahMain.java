package UTS.SistemManajemenSekolah;

public class SekolahMain {
        public static void main(String[] args) {
            Course course1 = new Course("Object-Oriented Programming");
            Teacher teacher1 = new Teacher("Eka Larasati Amalia", 35, "T001");
            teacher1.displayInfo();
            System.out.println("\n");
            Student student1 = new Student("Aqila Nur Azza", 19, "S001");
            student1.displayInfo();
            System.out.println("\n");
            Student student2 = new Student("Karina Icha Indasa", 20, "S002");
            student2.displayInfo();
            System.out.println("\n");
    
            // Menetapkan teacher untuk mata pelajaran
            course1.assignTeacher(teacher1);
    
            // Menambahkan siswa ke dalam mata pelajaran
            course1.addStudent(student1);
            course1.addStudent(student2);
            System.out.println("\n");
    
            // Menampilkan informasi mata pelajaran
            course1.displayCourseInfo();

        }
    
}
