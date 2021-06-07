package ro.ase.csie.bdsa.univ;

public class LaMaster extends Student implements ScriuLucrare{
    String facultateAbsolvita;
    String programMasterat;

    public LaMaster(String nume, String prenume, String adresaEmail, String cnp, char sex, int anInmatriculare, String facultate, String specializare, String facultateAbsolvita, String programMasterat) {
        super(nume, prenume, adresaEmail, cnp, sex, anInmatriculare, facultate, specializare);
        this.facultateAbsolvita = facultateAbsolvita;
        this.programMasterat = programMasterat;
    }

    @Override
    public void catScriu() {
        System.out.println("60 de pagini");
    }

    @Override
    public void ceScriu() {
        System.out.println("Lucrare de disertatie");
    }

    @Override
    public void invat() {
        System.out.println("Invat la " +programMasterat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LaMaster laMaster = (LaMaster) o;

        if (facultateAbsolvita != null ? !facultateAbsolvita.equals(laMaster.facultateAbsolvita) : laMaster.facultateAbsolvita != null)
            return false;
        return programMasterat != null ? programMasterat.equals(laMaster.programMasterat) : laMaster.programMasterat == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (facultateAbsolvita != null ? facultateAbsolvita.hashCode() : 0);
        result = 31 * result + (programMasterat != null ? programMasterat.hashCode() : 0);
        return result;
    }
}
