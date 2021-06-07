package ro.ase.csie.bdsa.popescumihaela.proiect;

public class Microbuz extends Masina implements IDeInchiriat {
    private int numarLocuri;
    private Boolean areTahograf;

    public Microbuz() {
    }

    public Microbuz(String culoare, float pret, String numarInmatriculare, String combustibil, Integer vitezaMaxima, int numarLocuri, Boolean areTahograf) {
        super(culoare, pret, numarInmatriculare, combustibil, vitezaMaxima);
        this.numarLocuri = numarLocuri;
        this.areTahograf = areTahograf;
    }

    @Override
    public float getNrRoti() {
        return 8;
    }

    @Override
    public float getPretInchirierePeZi() {
        return 500;
    }

    @Override
    public void adaugaTaxa(int procent) {
        if (procent > 0 && procent <= 100) {
            pret = (float)(pret * (100 + procent) /100);
        } else {
            pret *= 1.1;
        }

    }

    @Override
    public void porneste() {
        System.out.println("Porneste microbuzul cu "+numarLocuri +" numar de locuri");
    }
}
