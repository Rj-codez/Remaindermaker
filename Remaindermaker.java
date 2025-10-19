import java.util.Scanner;

public class Remaindermaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Remainder Maker====");

        System.out.print("Enter first Number:");
        int firstnum = scanner.nextInt();

        System.out.print("Enter Second Number:");
        int Secondnum = scanner.nextInt();

        int sum = firstnum % Secondnum;
        System.out.println( "Remainder:" + sum);
       
        scanner.close();
    }
    
}
