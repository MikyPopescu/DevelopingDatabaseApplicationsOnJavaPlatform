package ro.ase.csie.bdsa.univ;

public class Persoana {
    private String nume;
    private String prenume;
    private String adresaEmail;
    private String cnp;
    private char sex;

    public void cineSunt() {
        System.out.println("Ma numesc " + nume + " " + prenume);
        System.out.println("CNP " + cnp);
    }

    public Persoana() {
    }

    public Persoana(String nume, String prenume, String adresaEmail, String cnp, char sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresaEmail = adresaEmail;
        this.cnp = cnp;
        this.sex = sex;
    }

    public String valideazaCNP() {
        String ponderi = "279146358279";
        int suma = 0;
        for (int i = 0; i < 12; i++) {
            suma += Character.getNumericValue(cnp.charAt(i)) * Character.getNumericValue(ponderi.charAt(i));
        }
        //return "Suma este:" + suma;
        int rest = suma % 11;

        if((rest == Character.getNumericValue(cnp.charAt(12))) || (rest==10 && Character.getNumericValue(cnp.charAt(12))==1)){
            return "CNP Corect";
        }
        else{
            return "CNP ERONAT";
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persoana persoana = (Persoana) o;

        if (sex != persoana.sex) return false;
        if (nume != null ? !nume.equals(persoana.nume) : persoana.nume != null) return false;
        if (prenume != null ? !prenume.equals(persoana.prenume) : persoana.prenume != null) return false;
        if (adresaEmail != null ? !adresaEmail.equals(persoana.adresaEmail) : persoana.adresaEmail != null)
            return false;
        return cnp != null ? cnp.equals(persoana.cnp) : persoana.cnp == null;
    }

    @Override
    public int hashCode() {
        int result = nume != null ? nume.hashCode() : 0;
        result = 31 * result + (prenume != null ? prenume.hashCode() : 0);
        result = 31 * result + (adresaEmail != null ? adresaEmail.hashCode() : 0);
        result = 31 * result + (cnp != null ? cnp.hashCode() : 0);
        result = 31 * result + (int) sex;
        return result;
    }
}
