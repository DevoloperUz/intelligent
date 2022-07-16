package oopTasks.student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Alijon";
        student.lastName = "Sobirov";
        student.goup = "254-18";
        student.subjects = new String[]{"mathematics", "mothertongue", "geography", "literature", "english"};

        System.out.println(student.firstName);
        System.out.println(student.lastName);
        System.out.println(student.goup);
        student.aboutSubjects();
    }
}
