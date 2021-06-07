package ro.ase.csie.bdsa.popescumihaela.proiect;

public class Vehicul {
    protected String culoare;
    protected float pret;

    public Vehicul() {
    }

    public Vehicul(String culoare, float pret) {
        this.culoare = culoare;
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    //Conventie vehiculele din garaj au un pret de minim 1000 EUR
    public String validarePret(){
        if(pret<1000){
            return "Pret incorect";
        }
        else{
           return "Pret corect";
        }
    }

    public void formatareCuloare(){
        culoare.toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicul vehicul = (Vehicul) o;

        if (Float.compare(vehicul.pret, pret) != 0) return false;
        return culoare != null ? culoare.equals(vehicul.culoare) : vehicul.culoare == null;
    }

    @Override
    public int hashCode() {
        int result = culoare != null ? culoare.hashCode() : 0;
        result = 31 * result + (pret != +0.0f ? Float.floatToIntBits(pret) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "culoare='" + culoare + '\'' +
                ", pret=" + pret +
                '}';
    }
}
