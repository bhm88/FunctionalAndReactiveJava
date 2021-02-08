package lambdas;

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFuncInterface func = () -> System.out.println("inside method()");

        func.method1();
//passing behaviour to method,using functional interface
        ontheFly(() -> System.out.println("on the fly inside method() "));
    }

    private static void ontheFly(MyFuncInterface myFuncInterface) {
        myFuncInterface.method1();
    }
}
/*
invoke dynamic---thats a bytecode instruction that facilitate the implementation of dynamic languages through dynamic method invocation
javap -c E:\IntellijUltimateWS\FunctionalAndReactiveJava\out\production\FunctionalAndReactiveJava\lambdas\LambdaEx1.class*/


//lambdas are samrt anonumous functions they use type inference ,optimize memory,we can pass behaviour as parameters,enables diclarative programming

//declarative programming--programmer says what to do rather than how to do,lot of things can be hidden
//Functional Programming-subset of DP