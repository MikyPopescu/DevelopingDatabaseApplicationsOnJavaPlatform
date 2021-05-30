package ro.ase.csie.bdsa.sem1;

public class Metodele {

    public static void sayHello(String nume) {
        System.out.println("Hello " + nume);
    }

    //polimorphyism
    public static void sayHello(int nume) {
        System.out.println("Hello " + nume);
    }

    protected static String sayHelloF(int nume) {
        return "Hello " + nume;
    }


    protected static int addNumbers(int n1, int n2) {
        return n1 + n2;
    }

    protected static int addNumbers(int n1[]) {
       int s=0;
       for (int i=0;i< n1.length;i++){
           s+=n1[i];
       }
       return s;
    }

}
