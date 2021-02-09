package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 7, 8);
//accept method which does not return anything
       // void accept(T t);
        Consumer<Integer> consumer = e -> System.out.println(e);

        consumer.accept(10);

        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {

        for (T t : list) {
            consumer.accept(t);
        }
    }
}
