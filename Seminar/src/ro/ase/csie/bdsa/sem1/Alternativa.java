package ro.ase.csie.bdsa.sem1;

public class Alternativa {
    public static void main(String[] args) {
        int nota = 4; //neinitialized variable throws error / also primitives cannot recieve null initialization

        //Integer nota = null;

        boolean areBonus = true;

        if (nota < 5 && nota > 0 && !areBonus) {
            System.out.println("Picat");
        } else if (nota > 10 || nota < 1) {
            System.out.println("Nota invalida");
        } else {
            System.out.println("Promovat");
        }


        int zi = 3;
        String ziRo="";
        switch (zi) {
            case 1:
                ziRo = "Luni";
                break;
            case 2:
                ziRo = "Marti";
                break;
            case 3:
                ziRo = "Miercuri";
                break;
            case 4:
                ziRo = "Joi";
                break;
            case 5:
                ziRo = "Vineri";
                break;
            case 6:
                ziRo = "Sambata";
                break;
            case 7:
                ziRo = "Duminica";
                break;
        }
        System.out.println(ziRo);
    }
}
