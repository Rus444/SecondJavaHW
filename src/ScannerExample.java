import java.util.Scanner;

public class ScannerExample {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first integer number: ");
    int a = scanner.nextInt();

    System.out.println("Enter second integer number: ");
    int b = scanner.nextInt();

    System.out.println("Addition of " +a+ " and " +b+ " = " +(a+b));

    }
}
