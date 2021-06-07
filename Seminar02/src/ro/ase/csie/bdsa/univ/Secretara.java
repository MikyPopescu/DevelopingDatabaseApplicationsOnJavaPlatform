package ro.ase.csie.bdsa.univ;

public class Secretara extends Persoana{
    int salariu;
    public void activitate(){
        System.out.println("raspunde la telefon");
    }

    public Secretara(String nume, String prenume, String adresaEmail, String cnp, char sex, int salariu) {
        super(nume, prenume, adresaEmail, cnp, sex);
        this.salariu = salariu;
    }
}
