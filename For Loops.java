//imports scanner for input
import java.util.Scanner;

//defines class
class Selection_8 {
  public static void main (String args[]) {
    
    // defines variables
    Scanner input = new Scanner (System.in);
    int times;
    
    // introduction
    System.out.println("This output will output \" hello \" the number of times you specify.");
    
    //obtains number of time to output from user
    System.out.println("Please enter the number of times you wish to output between 1 and 3.");
    times = input.nextInt ();
    
    //outputs number of times the user specified
    for (; times >0; times--) { 
      System.out.println ("Hello");       
    }

  }
}
