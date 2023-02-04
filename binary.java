import java.util.Scanner;

public class binary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1 to convert binary to decimal ");
    System.out.println(" Enter 2 to convert decimal to binary: " );
    int choice = scanner.nextInt();
    
    if (choice == 1) 
    {
      System.out.println("Enter binary number: ");
      String binaryString = scanner.next();
      int decimal = Integer.parseInt(binaryString, 2);
      System.out.println("Decimal: " + decimal);
    } else if (choice == 2) {
      System.out.println("Enter decimal number: ");
      int decimal = scanner.nextInt();
      String binaryString = Integer.toBinaryString(decimal);
      System.out.println("Binary: " + binaryString);
    } else {
      System.out.println("Invalid");
    }
  }
}
