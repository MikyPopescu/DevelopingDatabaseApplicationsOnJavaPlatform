package ro.ase.csie.bdsa.univ;

public class Universitate {
    public static void main(String[] args) {
        Persoana p = new Persoana();
//        p.nume = "POPESCU";
//        p.prenume="Miky";
//        p.cnp="2950312435432";

        p.setNume("POPESCU");
        p.setPrenume("Miky");
        p.setCnp("2950312435432");

        p.cineSunt();

        Persoana p1 = new Persoana("IONESCU","Maria","ionescumaria16@stud.ase.ro","2971012460205",'f');
        p1.cineSunt();

//        Student s = new Student("GEORGESCU","Gigel","georgescugigel18@stud.ase.ro","1990301460208",'m',2018,"CSIE","Statistica");
//        s.cineSunt();
//        s.invat();

        LaLicenta l1 = new LaLicenta("PETRESCU","Petru","petrescupetru20@stud.ase.ro","5000405434354",'M',2020,"CSIE","Cibernetica","CNEC");
        LaMaster m1 = new LaMaster("MARINESCU","Maria","marinescumaria16@stud.ase.ro","2970405434354",'F',2019, "CSIE","Contabilitate","CIG","SIMPRE");

        l1.ceScriu();
        m1.ceScriu();


        l1.catScriu();
        m1.catScriu();

//        l1.invat();
//        m1.invat();

//Polimorfism
        studentInvata(l1);
        studentInvata(m1);

        Student s;
        s = new LaLicenta("IONESCU","Petru","ionescupetru20@stud.ase.ro","5000405434354",'M',2020,"CSIE","Statistica","CNEC");
        studentInvata(s);


        ScriuLucrare scriuLucrare = new LaLicenta("Pana","Petru","panapetru20@stud.ase.ro","5000405434354",'M',2020,"CSIE","Infomarica","CNGM");
        scriuLucrare.ceScriu();
        scriuLucrare.catScriu();


        System.out.println(l1); //toString

        LaMaster m2 = new LaMaster("MARINESCU","Maria","marinescumaria16@stud.ase.ro","2970405434354",'F',2019, "CSIE","Contabilitate","CIG","SIMPRE");
        System.out.println(m1.equals(m2));

        System.out.println(m2.valideazaCNP());

    }

    public static void studentInvata(Student student){
        student.invat();
    }
}
