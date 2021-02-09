package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {


    public static void main(String[] args) {


        //get method---T get();takes nothing but returns something

        Supplier<String> supplier=()->new String("new string");

        System.out.println(supplier.get());

        Supplier<Double> randomNumber=()->Math.random();

        System.out.println(randomNumber.get());
    }
}