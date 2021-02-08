package lambdas;

import java.util.stream.IntStream;

public class DeclraiveandImperativeApproach {
    public static void main(String[] args) {
        int sum = 0;
//familier but more code,not thread safe,sum is mutating variable
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("using imperative approach " + sum);

        //using declrative approach

        //easy,concise
        //expressions not statements
        //not mutating any variables,jvm takes care under the hood
//thread safe in case of multithreaded
        int sum1 = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println("using declrative approach" + sum1);
    }
}
