package ro.ase.csie.bdsa.sem1;

public class Variables {
    public static void main(String[] args) {
        // 8 primitive datatypes
        int x = 100; //4b
        x=x+10;
        x++;
        x+=20;
        System.out.println("x= " + x);

        long y = 100000000; //8b
        System.out.println("y= " + y);

        short s = -32756;
        System.out.println("s= " + s);

        byte b = 127;
        System.out.println("b= " + b);

        float f = 58.54f; //4b
        System.out.println("f= " + f);

        double d = 124.35235;//8b;
        System.out.println("x= " + d);

        char c = 'm'; //2b - only 1 character
        System.out.println("c= " + c);
        String st = "Miky";

        boolean bo = true;
        System.out.println("bo= " + bo);
        System.out.println(bo == true);
        System.out.println("=================================");
        //array
        int[] array = new int[100]; //100 position indexes 0-99

        for(int i=0;i<array.length;i++){
            array[i] = i*5;
            System.out.println("Position= "+ i +" Element= " + array[i]);
        }
        System.out.println("=================================");
        double[] arrayD = new double[100];
        for(int i=0;i<arrayD.length;i++){
            arrayD[i] = Math.pow(2,i); //2^i
            System.out.println("Position= "+ i +" Element= " + array[i]);
        }
        System.out.println("=================================");
    }
}
