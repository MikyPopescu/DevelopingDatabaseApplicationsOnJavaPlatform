package ro.ase.csie.bdsa.sem1;

public class MetodeMain {
    public static void main(String[] args) {
        Metodele.sayHello("Miky");

        Metodele.sayHello(123);

        System.out.println(Metodele.sayHelloF(1));

        System.out.println(Metodele.addNumbers(5,5));

        System.out.println(Metodele.addNumbers(new int[]{5,6,3}));
    }
}
