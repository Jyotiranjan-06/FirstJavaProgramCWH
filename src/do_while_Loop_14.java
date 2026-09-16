import java.util.Scanner;
public class do_while_Loop_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Example 1: Print 1 to 5

        int i = 1;

        do {
            System.out.println(i);

            // Increase i by 1
            i++;

        } while (i <= 5);


        // Example 2: Add numbers

        int number;
        int sum = 0;

        System.out.println("\nEnter numbers");
        System.out.println("Enter 0 to stop");

        do {

            System.out.print("Enter a number: ");
            number = sc.nextInt();

            // Add number to sum
            if (number != 0) {
                sum = sum + number;
            }

        } while (number != 0);

        System.out.println("Total Sum = " + sum);

        sc.close();
    }
}
