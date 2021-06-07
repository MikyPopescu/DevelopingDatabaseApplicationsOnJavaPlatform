package ro.ase.csie.bdsa.popescumihaela.proiect;

public class Reparatie<A, B> {
    A a;
    B b;

    public Reparatie(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void afiseaza() {
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
