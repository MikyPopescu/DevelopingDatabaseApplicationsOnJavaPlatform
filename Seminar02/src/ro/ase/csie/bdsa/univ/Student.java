package ro.ase.csie.bdsa.univ;

public abstract class Student extends Persoana {
    int anInmatriculare;
    String facultate;
    String specializare;

    public Student(String nume, String prenume, String adresaEmail, String cnp, char sex, int anInmatriculare, String facultate, String specializare) {
        super(nume, prenume, adresaEmail, cnp, sex);
        this.anInmatriculare = anInmatriculare;
        this.facultate = facultate;
        this.specializare = specializare;
    }

    public void cineSunt(){
        String inmatriculat = (getSex()=='F')?"inmatriculata":"inmatriculat";
        System.out.println("Ma numesc "+getNume() + " " +getPrenume() );
        System.out.println("CNP "+getCnp());
        System.out.println("am fost "+inmatriculat + " in anul " +anInmatriculare);
    }

    public abstract void invat();//{
      //  System.out.println("Invat...");
   // }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (anInmatriculare != student.anInmatriculare) return false;
        if (facultate != null ? !facultate.equals(student.facultate) : student.facultate != null) return false;
        return specializare != null ? specializare.equals(student.specializare) : student.specializare == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + anInmatriculare;
        result = 31 * result + (facultate != null ? facultate.hashCode() : 0);
        result = 31 * result + (specializare != null ? specializare.hashCode() : 0);
        return result;
    }
}
