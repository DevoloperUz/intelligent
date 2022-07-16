package example.java8.functionalInterface.part1;

public class OprationableDemo {
    public static void main(String[] args) {

        /*
        CONCREAT CLASS
         */

       /* Operationable operationable1 = new SumCalculation();
        System.out.println(operationable1.calculate(40, 60));

        Operationable operationable2 = new AverageCalcuation();
        System.out.println(operationable2.calculate(40, 60));*/

        /*
        ANONYMOUS CLASS
         */

        /*Operationable operation1 = new Operationable() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        int sum = operation1.calculate(40, 60);
        System.out.println(sum);

        Operationable operation2 = new Operationable() {
            @Override
            public int calculate(int a, int b) {
                return (a + b) / 2;
            }
        };

        int average = operation2.calculate(40, 60);
        System.out.println(average);*/

        /*
        LAMBDA EXPRESSION
         */

        // 1 - Shakl
        /*Operationable operation1 = (a, b) -> {

            return a + b;
        };

        int sum = operation1.calculate(40, 60);
        System.out.println(sum);

        // 2 - Shakl
        Operationable operation2 = (a, b) -> (a + b) / 2;

        int average = operation2.calculate(40, 60);
        System.out.println(average);*/

        /*
        Method reference
         */

        /*Operationable<Integer, Integer> operation2 = Integer::sum;

        int average = operation2.calculate(40, 60);
        System.out.println(average);

        Operationable<Integer, Integer> operation3 = (a, b) -> a - b;
         int ayirma = operation3.calculate(35, 25);
        System.out.println(ayirma);*/

    }
}
