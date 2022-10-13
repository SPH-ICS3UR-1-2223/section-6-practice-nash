package ValidatePin;
import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        
    	//Declare a valid integer PIN
    	int  PIN = 12435;
    	Scanner in = new Scanner(System.in);
    		
    	
    	//Prompt the user to enter the PIN
    	int guess=in.nextInt();
    		
    	
    	
    	//Using a 'while' loop perform the steps
    		// -Compare the user-entered PIN with the already declared PIN
    		//If the entered PIN is no the same, prompt user to enter the PIN again
    		//Repeat the loop until the PIN is entered
    	while (PIN!=guess) {
    		System.out.println("You entered the wrong pin");
    		guess=in.nextInt();
    	}
    		
    	
    	//Print a message confirming that the correct PIN has been entered and that the user now has access to their account
    	System.out.println("You have entered the correct PIN number. You have now been granted access to your account");
    		
    	
    	
    }
}
