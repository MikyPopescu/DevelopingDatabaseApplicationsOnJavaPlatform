package ro.ase.csie.bdsa.popescumihaela.proiect;

public class Bicicleta extends Vehicul {
    private String serie;
    private int numarViteze;

    public Bicicleta() {
    }

    public Bicicleta(String culoare, float pret, String serie, int numarViteze) {
        super(culoare, pret);
        this.serie = serie;
        this.numarViteze = numarViteze;
    }

    public void determinareTraseu() {
        if (numarViteze == 0) {
            System.out.println("Ideala pentru oras");
        }else{
            System.out.println("Ideala pentru trasee accidentate");
        }
    }
}
