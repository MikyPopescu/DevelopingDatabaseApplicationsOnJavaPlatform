package ro.ase.csie.bdsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Stringuri {
    public static void main(String[] args) {
        String a = "Buna seara BDSA!";

        System.out.println(a.length());
        System.out.println(a.substring(1));
        System.out.println(a.substring(1, 4));
        //System.out.println(a.substring(5,4)); //err
        System.out.println(a.substring(5, 5)); //emptystring
        System.out.println(a.charAt(3));

        String b = "ABuna seara";
        String c = "Buna seara BDSA!";
        System.out.println(a == b); //false
        System.out.println(a == c); //true
        String d = new String("Buna seara BDSA!");
        System.out.println(a == d); //false
        System.out.println(a.equals(d)); //true
        System.out.println(a.equals(b)); //false


        System.out.println(a.compareTo(d)); //0 - stringuri egale
        System.out.println(a.compareTo(b)); //1 - A < B
        System.out.println(b.compareTo(a)); //-1 - A < B

        String m = "miky.popescu@stud.ase.ro";
        System.out.println(m.indexOf('p')); //p este pe pozitia 5
        System.out.println(m.indexOf("ase")); //indexul lui a

        System.out.println(m.substring(m.indexOf('@') + 1)); //stud@ase.ro

//Sa se calculeze suma cifrelor
        String n = "73:2001:72:483298:10";
        String[] cifre = n.split(":"); //cifre: 73 2001 72 48329 10
        int suma = 0;
        for (int i = 0; i < cifre.length; i++) {
            suma += Integer.valueOf(cifre[i]);
        }
        System.out.println("Suma: " + suma);
        suma = 0;
        int i = -1;
        int j = 0;
        while (j >= 0) {
            j = n.indexOf(':', i + 1);
            String nr = n.substring(i + 1, j >= 0 ? j : n.length());
            System.out.println(nr);
            suma += Integer.parseInt(nr);
            i = n.indexOf(':', j);
        }
        System.out.println("Suma: " + suma);


        String text = "Ala, bala} portocala; ala[] bala lala, ala";
        //De cate ori apare fiecare cuvant, ignorand caseul si celelalte semne dintre cuvinte
        //ala - 3x; bala - 2x; portocala - 1x; lala - 1x
        HashMap<String, Integer> cuvintele = new HashMap<>();
        for (int k = 0; k < text.split(" ").length; k++) {
            String cuvant = text.toLowerCase().split(" ")[k].replaceAll("[^a-zA-Z0-9]", "");
            int nr = 0;
            if (cuvintele.containsKey(cuvant)) {
                nr = cuvintele.get(cuvant) + 1;
                cuvintele.put(cuvant, nr);
            } else {
                cuvintele.put(cuvant, nr + 1);
            }
        }
        System.out.println(cuvintele);

    }
}
