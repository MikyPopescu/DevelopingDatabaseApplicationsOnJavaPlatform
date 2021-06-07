package ro.ase.csie.bdsa.popescumihaela.proiect;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Garaj {
    public static void main(String[] args) {
        System.out.println("ABSTRACTIZAREA DATELOR:");
        Vehicul vehiculTest = new Vehicul();
        vehiculTest.setCuloare("ROSU");
        vehiculTest.setPret(5000);
        System.out.println(vehiculTest);
        System.out.println("\n================\n");

        Vehicul vehicul = new Vehicul("ROSU", 3500);
        System.out.println(vehicul);
        System.out.println("\n================\n");

        Bicicleta bicicleta = new Bicicleta("ALBASTRU", 200, "RXMDK92350", 10);
        bicicleta.determinareTraseu();
        System.out.println("\n================\n");

        Autoutilitara autoutilitara = new Autoutilitara("ALB", 10000, "B65LDZ", "Diesel", 100, 3.5f, true);
        System.out.println(autoutilitara.getNrRoti());
        System.out.println(autoutilitara.getPretInchirierePeZi());
        System.out.println("Pret initial:" + autoutilitara.getPret());
        autoutilitara.adaugaTaxa(10);
        System.out.println("Pret dupa adaugare taxa: " + autoutilitara.getPret());
        autoutilitara.porneste();
        System.out.println("\n================\n");

        Microbuz microbuz = new Microbuz("VERDE", 20000, "B50ADI", "Diesel", 110, 80, false);
        System.out.println(microbuz.getNrRoti());
        System.out.println(microbuz.getPretInchirierePeZi());
        System.out.println("Pret initial:" + microbuz.getPret());
        microbuz.adaugaTaxa(10);
        System.out.println("Pret dupa adaugare taxa: " + microbuz.getPret());
        microbuz.porneste();
        System.out.println("\n================\n");

        //Masina masina = new Autoutilitara();


        System.out.println("MASINI DIN BAZA DE DATE:");

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//193.226.34.57:1521/oradb", "bdsa_popescum", "STUD");
             Statement statement = con.createStatement()) {

            try (ResultSet rs = statement.executeQuery("SELECT culoare, pret, numarInmatriculare, combustibil, vitezaMaxima from masini")) {
                while (rs.next()) {
                    System.out.println(rs.getString("CULOARE") + ", ");
                    System.out.println(rs.getFloat("PRET") + ", ");
                    System.out.println(rs.getString("NUMARINMATRICULARE") + ", ");
                    System.out.println(rs.getString("COMBUSTIBIL") + ", ");
                    System.out.println(rs.getInt("VITEZAMAXIMA") + " ");
                    System.out.println();
                }
                System.out.println("\nDetalii BD:");
                ResultSetMetaData rsmd = rs.getMetaData();
                System.out.println("Nr. coloane: " + rsmd.getColumnCount());
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
            }
        } catch (Exception e) {
            System.out.println("Fara conexiune..." + e);
        }


        System.out.println("\n================\n");


        ArrayList<HashMap<Vehicul, String>> listaVehicule = new ArrayList<HashMap<Vehicul, String>>();


        HashMap<Vehicul, String> parcAuto1 = new HashMap<Vehicul, String>();

        //vehicul + data achizitie
        parcAuto1.put(autoutilitara, "13-04-2021");
        parcAuto1.put(bicicleta, "18-05-2021");
        parcAuto1.put(microbuz, "25-05-2021");
        parcAuto1.put(vehicul, "12-05-2021");

        listaVehicule.add(parcAuto1);


        HashMap<Vehicul, String> parcAuto2 = new HashMap<Vehicul, String>();

        //vehicul + data achizitie
        parcAuto2.put(autoutilitara, "13-04-2020");
        parcAuto2.put(bicicleta, "18-05-2020");
        parcAuto2.put(microbuz, "20-05-2020");
        parcAuto2.put(vehicul, "02-05-2020");

        listaVehicule.add(parcAuto2);

        for (HashMap<Vehicul, String> m : listaVehicule)
            System.out.println(m.get(vehicul) + " " + m.get(bicicleta) + " " +
                    m.get(microbuz) + " " + m.get(autoutilitara));


        System.out.println("\n================\n");

        System.out.println("GENERICE:");
        Reparatie<String, Integer> reparatie = new Reparatie<>("Schimb roti", 100);
        reparatie.afiseaza();
        System.out.println("\n================\n");
        Integer pretul = reparatie.getB();
        System.out.println(pretul);
        String reparatia = reparatie.getA();
        System.out.println(reparatia);
        System.out.println("\n================\n");

        ParcAuto<Vehicul> box = new ParcAuto<Vehicul>();
        box.add(vehicul);
        box.add(autoutilitara);
        box.add(microbuz);
        box.add(bicicleta);
        box.show();
        box.remove(bicicleta);
        box.show();
        System.out.println("Parcul auto are " + box.getSize() + " vehicule");


    }
}
