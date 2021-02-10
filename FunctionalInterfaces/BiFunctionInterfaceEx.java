package FunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionInterfaceEx {
    public static void main(String[] args) {

        BiFunction<String,String,String> biFunction=(a,b)->a+b;

        System.out.println(biFunction.apply("bharat","hm"));


        BiFunction<String,String,Integer> biFunction1=(a,b)->(a+b).length();

        System.out.println(biFunction1.apply("bharat","hm"));

    }
}
