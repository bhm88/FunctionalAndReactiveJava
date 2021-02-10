package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnrayOpsExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2, 4, 6, 8, 10);

        //public interface UnaryOperator<T> extends Function<T, T> {

        //input and output argumets type are same
        UnaryOperator<Integer> ops = i -> i * 10;

        List<Integer> newList = mapper(al, ops);
        System.out.println(newList);
    }

    private static <T> List<T> mapper(List<T> al, UnaryOperator<T> ops) {
        List<T> newList = new ArrayList<>();
        for (T t : al) {
            newList.add(ops.apply(t));

        }
        return newList;
    }
}
