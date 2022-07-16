package example.person;

public class PersonDemo {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = " G'iyosbek ";
        person.sayName();

        Person person1 = new Person();
        person1.name = " Ali ";

        Person person2 = new Person();

        Person person3 = person;

        Person person4 = person1;

        Person person5 = person2;

        person = null;
        person1 = null;
        person2 = null;


    }
}
