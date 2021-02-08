package lambdas;

public class LambdaEx {


    public static void main(String[] args) {
        Thread t = new Thread(() -> {

            System.out.println("inside run method");
        });
        t.start();


    }
}