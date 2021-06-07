package ro.ase.csie.bdsa.univ;

public class LaLicenta extends Student implements ScriuLucrare {
    String liceuAbsolvit;

    public LaLicenta(String nume, String prenume, String adresaEmail, String cnp, char sex, int anInmatriculare, String facultate, String specializare, String liceuAbsolvit) {
        super(nume, prenume, adresaEmail, cnp, sex, anInmatriculare, facultate, specializare);
        this.liceuAbsolvit = liceuAbsolvit;
    }

    @Override
    public void catScriu() {
        System.out.println("40 de pagini");
    }

    @Override
    public void ceScriu() {
        System.out.println("Lucrare de licenta");
    }

    @Override
    public void invat() {
        System.out.println("Invat la "+specializare);
    }

    @Override
    public String toString() {
        return "LaLicenta{" +
                "liceuAbsolvit='" + liceuAbsolvit + '\'' +
                ", nume='" + getNume() + '\'' +
                ", prenume='" + getPrenume() + '\'' +
                ", adresaEmail='" + getAdresaEmail() + '\'' +
                ", cnp='" + getCnp() + '\'' +
                ", sex=" + getSex() +
                ", anInmatriculare=" + anInmatriculare +
                ", facultate='" + facultate + '\'' +
                ", specializare='" + specializare + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LaLicenta laLicenta = (LaLicenta) o;

        return liceuAbsolvit != null ? liceuAbsolvit.equals(laLicenta.liceuAbsolvit) : laLicenta.liceuAbsolvit == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (liceuAbsolvit != null ? liceuAbsolvit.hashCode() : 0);
        return result;
    }
}
