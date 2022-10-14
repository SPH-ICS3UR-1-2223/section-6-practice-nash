package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    	
    	//Develop a program to calculate the multiples of a given number using a "for" loop
    	//Have the user enter a number
    	System.out.println("Please enter a number");
    	
    	Scanner in = new Scanner(System.in);
    	//Use a "for" loop to display all the multiples of that number from 1 to 12
    	int userNumber = in.nextInt();
        for (int i=1;i<=12;i++) {
    	   System.out.println(userNumber+" x "+i+" = "+(i*userNumber));
       }
       /*
        * int i=1;
        * while (i<=12){
        * 	System.out.println(userNumber+" x "+i+" ="+(i*userNumber));
        * 	i++;
        * }
        */
    }

}
