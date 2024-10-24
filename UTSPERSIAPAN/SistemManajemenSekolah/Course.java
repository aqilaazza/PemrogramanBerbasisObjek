package UTS.SistemManajemenSekolah;

import java.util.ArrayList;

public class Course {
    public String courseName;
    private Teacher assignedTeacher;
    private ArrayList<Student> students = new ArrayList<>();

    public Course (String courseName) {
        this.courseName = courseName;
        
    }

    public void assignTeacher(Teacher teacher) {
        this.assignedTeacher = teacher;
        System.out.println("Teacher " + teacher.name + " has been assigned to course " + courseName);
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.name + " has been added to course " + courseName);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        if (assignedTeacher != null) {
            System.out.println("Assigned Teacher: " + assignedTeacher.name);
        }
        System.out.println("Students Enrolled:");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}
