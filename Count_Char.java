import java.util.Scanner;

class String_1 {
  public static void main (String args[]) {
    Scanner string = new Scanner (System.in);
    String message;
    
    System.out.print("Please enter a sentence:");
    message = string.nextLine();
    
    System.out.print("The number of characters in your sentence (spaces included) is:" + message.length());
  }
}