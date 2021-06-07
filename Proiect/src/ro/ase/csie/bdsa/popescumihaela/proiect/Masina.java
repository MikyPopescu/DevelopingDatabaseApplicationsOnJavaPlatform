package ro.ase.csie.bdsa.popescumihaela.proiect;

public abstract class Masina extends Vehicul {
    private String numarInmatriculare;
    private String combustibil;
    private Integer vitezaMaxima;

    public Masina() {
    }

    public Masina(String culoare, float pret, String numarInmatriculare, String combustibil, Integer vitezaMaxima) {
        super(culoare, pret);
        this.numarInmatriculare = numarInmatriculare;
        this.combustibil = combustibil;
        this.vitezaMaxima = vitezaMaxima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Masina masina = (Masina) o;

        if (numarInmatriculare != null ? !numarInmatriculare.equals(masina.numarInmatriculare) : masina.numarInmatriculare != null)
            return false;
        if (combustibil != null ? !combustibil.equals(masina.combustibil) : masina.combustibil != null) return false;
        return vitezaMaxima != null ? vitezaMaxima.equals(masina.vitezaMaxima) : masina.vitezaMaxima == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (numarInmatriculare != null ? numarInmatriculare.hashCode() : 0);
        result = 31 * result + (combustibil != null ? combustibil.hashCode() : 0);
        result = 31 * result + (vitezaMaxima != null ? vitezaMaxima.hashCode() : 0);
        return result;
    }

    public void afisareMasina(){
       System.out.println("Masina " + numarInmatriculare + " are culoarea "+getCuloare() + " si prinde viteaza maxima de "+vitezaMaxima + " km/h");
   }


    public abstract void porneste();
}
