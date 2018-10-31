//imports scanner for input
import java.util.Scanner;

//defines class
class GCD_Recursion {
  public static void main (String args[]) {
    
    // defines variables
    Scanner input = new Scanner (System.in);
    int num1, num2, gcd;
    
    // introduction
    System.out.println("This program will obtain the gcd of the numbers entered.");
    
    //gets the first number from the user
    System.out.println ("Please enter the first integer.");
    num1 = input.nextInt ();
    
    //gets the second number from the user
    System.out.println ("Please enter the second integer.");
    num2 = input.nextInt ();
    
    //calculates factorial
    gcd = calcGCD (num1, num2);
    
    //outputs calculated factorial to screen
    System.out.println ("The GCD of " + num1 + " and " + num2 + " is " + gcd + ".");
  }
  
  
  
  //will calculate the gcd of two numbers, using subtraction method
  public static int calcGCD(int num1, int num2) {
    int gcd=1;
    if (num1 == num2) {
      gcd = num1;
    }
    else if (num1 > num2) {
      gcd = calcGCD (num1-num2, num2);
    }
    else if (num2 > num1) {
      gcd = calcGCD (num2-num1, num1);
    }
    return gcd;
  }
}

