import java.util.Scanner;

public class while_loop_13 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        Scanner sc = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.println("===== Number Program =====");
        System.out.println("Enter 0 to Stop");

        // Jab tak user 0 enter nahi karta, loop chalega
        while (true) {

            System.out.print("Enter a number: ");
            number = sc.nextInt();

            // Agar number 0 hai to loop stop
            if (number == 0) {
                break;
            }

            // Number ko sum me add karna
            sum = sum + number;

            // Number count karna
            count++;

            // Even/Odd check karna
            if (number % 2 == 0) {
                System.out.println("This is an Even Number");
            }
            else {
                System.out.println("This is an Odd Number");
            }
        }

        // Final result
        System.out.println("\n===== Result =====");
        System.out.println("Total Numbers: " + count);
        System.out.println("Total Sum: " + sum);

        sc.close();
    }
}
