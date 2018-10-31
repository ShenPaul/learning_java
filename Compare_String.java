import java.util.Scanner;

class Compare_String {
  public static void main (String args[]) {
    Scanner string = new Scanner (System.in);
    String message1, message2;
    int compare;
    
    System.out.print("Please enter the first string:");
    message1 = string.nextLine();
    System.out.print("Please enter the second string:");
    message2 = string.nextLine();
    
    compare = (message1.compareTo(message2));
    System.out.println(compare);
    
    if (compare > 0) {
      System.out.print("This means that the first word is greater than the second word.");
    } else if (compare < 0) {
      System.out.print("This means that the first word is less than the second word.");
    } else {
      System.out.print("This means that the first word is equal to the second word.");
    }
  }
}