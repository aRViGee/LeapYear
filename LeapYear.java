import java.util.Scanner;  // Import the Scanner class

public class LeapYear {

    public static void main(String[] args) {
               
        boolean isLeap = false;        
        
        System.out.println("Welcome to the leap year checker!");
        Scanner yearScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What year do you want to check: ");
        
        int inputYear = yearScanner.nextInt();  // Read user input
        System.out.println("The year you want to check is: " + inputYear);  // Output user input
        
        
        if ((inputYear % 400 == 0) || (inputYear % 4 == 0) && (inputYear % 100 != 0)) {
            
            isLeap = true; 
        }            
   
        if (isLeap == true) {
            System.out.println(inputYear + " is a leap year!");
        }
        
        else {
            
            System.out.println(inputYear + " is not a leap year!");
        }
        
        yearScanner.close();
    }
}