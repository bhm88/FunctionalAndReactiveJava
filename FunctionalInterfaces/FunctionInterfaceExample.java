package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {

//  R apply(T t);
        //Function is used for transformation
        List<String> list = Arrays.asList("kit", "kat", "shake");
        Function<String, Integer> func = s -> s.length();

        System.out.println(func.apply("bharat"));

        Function<String, Integer> func1 = s -> s.length();


        List<Integer> newlist = map(list, func1);
        System.out.println(newlist);


    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> func1) {
        List<R> newList = new ArrayList<>();

        for (T t : list) {
            newList.add(func1.apply(t));
        }
        return newList;
    }
}
