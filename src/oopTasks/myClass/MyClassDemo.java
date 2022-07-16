package oopTasks.myClass;

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.firstAttribut = 10;
        myClass.secondAttribut = 25;

        System.out.println(myClass.aboutAttributes(10,25));
        System.out.println(myClass.sumAttributes(10,25));
        System.out.println(myClass.maxAttribute(10,25));
    }
}
