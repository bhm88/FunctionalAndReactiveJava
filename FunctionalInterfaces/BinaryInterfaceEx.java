package FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryInterfaceEx {
    public static void main(String[] args) {


        BinaryOperator<String> binaryOperator=(a,b)->a+ "."+b;

        System.out.println(binaryOperator.apply("bharat","hm"));
    }
}
