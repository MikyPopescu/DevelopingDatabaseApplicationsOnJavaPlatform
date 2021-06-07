package ro.ase.csie.bdsa.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numele: ");
        String numele = input.nextLine();
        System.out.println("Buna ziua " + numele);

        String n = "764832:478394:231:23213:98392:210:38921";
        Scanner input2 = new Scanner(n).useDelimiter(":");
//        System.out.println(input2.nextInt());
//        System.out.println(input2.nextInt());
//        System.out.println(input2.nextInt());
//        System.out.println(input2.nextInt());
//        System.out.println(input2.nextInt());
//        System.out.println(input2.nextInt());
//        System.out.println(input2.nextInt());

        //Parcurgeti input2 folosind un for/while

        while (input2.hasNext()) {
            System.out.println(input2.nextInt());
        }

        for (Scanner it = input2; it.hasNext(); ) {
            System.out.println(it.next());
        }

        input2.forEachRemaining(s -> System.out.println(s));

        File file = new File("values.txt");
        Scanner input3 = null;
        try {
            input3 = new Scanner(file);

            while (input3.hasNextLine()) {
                String line = input3.nextLine();
                Integer nr = Integer.parseInt(line);
                System.out.println("Nr= " + nr);
            }
            ///input3.close();

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Fisier inexistent -> " + e);
        } finally {
            if (input3 != null) {
                System.out.println("S-a inchis!");
            }
            input3.close();
        }

        //Sa se cuteasca Values.csv intr o lista de liste
        ArrayList<ArrayList<String>> listaDeListe = new ArrayList<>();
        ArrayList<String> oLista;

        File file2 = new File("Values.csv");
        try (Scanner input4 = new Scanner(file2)) {
            while(input4.hasNext()){
                ArrayList<String> listaI = new ArrayList<>();
                String linie = input4.nextLine();
                String[] s = linie.split(",");
                oLista = new ArrayList<>(Arrays.asList(s));
                listaDeListe.add(oLista);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(listaDeListe);


        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//193.226.34.57:1521/oradb","bdsa_popescum","STUD");
            Statement statement = con.createStatement()){

            try(ResultSet rs = statement.executeQuery("SELECT marca, nume, prenume from studenti")){
                while(rs.next()){
                    System.out.println(rs.getInt("MARCA")+", ");
                    System.out.println(rs.getString("NUME")+", ");
                    System.out.println(rs.getString("PRENUME")+", ");
                    System.out.println();
                }
            }
        }
        catch (Exception e){
            System.out.println("Fara conexiune..." + e);
        }

    }
}
