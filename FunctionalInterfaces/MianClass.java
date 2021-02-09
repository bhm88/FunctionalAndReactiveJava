package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MianClass {
    public static void main(String[] args) {
        FuncGenericInterface<String, String> ex1 = s -> s.substring(1, 5);
        System.out.println(ex1.execute("hello world"));

        FuncGenericInterface<String, Integer> ex2 = s -> s.length();
        System.out.println(ex2.execute("hello world"));


        //Predicate----test
        List<String> al = new ArrayList<>();
        al.add("hello");
        al.add("");
        al.add("world");
        al.add("");

        List<Integer> ints = Arrays.asList(2, 4, 5, 7, 8);

        Predicate<String> p = s -> !s.isEmpty();
        Predicate<String> p1 = s -> s.contains("hello");
        Predicate<Integer> p2 = s -> s % 2 == 0;

        List<String> newList = filterList(al, p);
        System.out.println(newList);
        List<String> newList1 = filterList(al, p1);
        System.out.println(newList1);
        List<Integer> newints = filterList(ints, p2);
        System.out.println(newints);

    }

    //making it as generic by using T
    private static <T> List<T> filterList(List<T> al, Predicate<T> p) {
        List<T> newList = new ArrayList<>();

        for (T s : al) {
            if (p.test(s)) {
                newList.add(s);
            }
        }
        return newList;

    }
}
