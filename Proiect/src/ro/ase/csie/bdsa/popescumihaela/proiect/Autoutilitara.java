package ro.ase.csie.bdsa.popescumihaela.proiect;

public class Autoutilitara extends Masina implements IDeInchiriat {
    private float tonaj;
    private Boolean areLift;

    public Autoutilitara(String culoare, float pret, String numarInmatriculare, String combustibil, Integer vitezaMaxima, float tonaj, Boolean areLift) {
        super(culoare, pret, numarInmatriculare, combustibil, vitezaMaxima);
        this.tonaj = tonaj;
        this.areLift = areLift;
    }

    @Override
    public float getNrRoti() {
        return 6;
    }

    @Override
    public float getPretInchirierePeZi() {
        return 200;
    }

    @Override
    public void adaugaTaxa(int procent) {

        if (procent > 0 && procent <= 100) {
            pret = (float)(pret * (100 + procent) /100);
        } else {
         pret *= 1.08;
        }
        System.out.println("Taxa adaugata!");
    }

    @Override
    public void porneste() {
        System.out.println("Porneste autoutilitara de "+tonaj + " tone");
    }
}
