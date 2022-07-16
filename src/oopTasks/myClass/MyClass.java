package oopTasks.myClass;

public class MyClass {
    double firstAttribut;
    double secondAttribut;

    /**
     * ekranga chiqarish
     * @param firstAttribut - birinchi qiymat
     * @param secondAttribut - ikkinchi qiymat
     * @return
     */
        double aboutAttributes (double firstAttribut,double secondAttribut) {
            System.out.println(firstAttribut);
            System.out.println(secondAttribut);
            return 0;
    }

    double sumAttributes (double firstAttribut, double secondAttribut) {

            return firstAttribut + secondAttribut;
    }

    double maxAttribute (double firstAttribut, double secondAttribut) {
            if (firstAttribut > secondAttribut)
                System.out.println(firstAttribut);
            else System.out.println(secondAttribut);
            return 0;
    }
}
