import java.util.Scanner;
/**
 * This program determines whether a number is even or odd
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //prompt for interger
    System.out.println("Please enter an integer:");

    //get interger from user
    int num = input.nextInt();

    //calculate remainder
    int remainder = num % 2;

    if(remainder > 0){
      //tell them that the number is odd
      System.out.println(num + " is an odd number");
    } else
    // tell them that the number is even
    System.out.println(num + " is an even number");
    
  }
}
