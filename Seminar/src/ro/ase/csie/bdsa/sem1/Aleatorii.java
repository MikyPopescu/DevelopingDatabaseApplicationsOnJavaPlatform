package ro.ase.csie.bdsa.sem1;

import java.util.Random;

public class Aleatorii {
    public static void main(String[] args) {
        int[] val = new int[100];
        float mean = 0, sum = 0;
        int i;
        Random random = new Random();

        for ( i = 0; i < val.length; i++) {
            val[i] = random.nextInt(500);
            System.out.println(val[i]);

            //mean
            float oldMean = mean;
            mean += (val[i] - mean) / (i + 1);
            sum += (val[i] - mean) / (val[i] - oldMean);
        }
        //mean
        System.out.println("Mean= " +mean + ", i="+i);

        //variance
        System.out.println("Variance= "+sum/(i-1));

        //std deviation = sqrt(variance)
        System.out.println("Standard deviation= "+Math.sqrt(sum/(i-1)));
        System.out.println("Standard deviation= "+Math.sqrt(sum/(i)));


        while(true){
            System.out.println("Hello");
            break;
        }

    }
}
