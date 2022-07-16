package oopTasks.date;

public class Date {
    int year;
    int month;
    int day;

    String date ( int year, int month, int day) {
        System.out.println(year + "." + month + "." + day);
        return null;
    }

    void setDate(int y, int M, int d) {
        year = y;
        month = M;
        day = d;
    }
}
