import java.util.Scanner;

public class ModulusExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number=scanner.nextInt();
                if(number%2==0){
                    System.out.println("even number");
                }else{
                    System.out.println("odd number");
                }
    }
}
