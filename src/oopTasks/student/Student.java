package oopTasks.student;

public class Student {
    String lastName;
    String firstName;
    String goup;
    String[] subjects = new String[5];

    String aboutSubjects() {
        for (String subject : subjects)
            System.out.println(subject);
        return null;
    }
}
