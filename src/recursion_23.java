import java.util.Scanner;

public class recursion_23 {
    // factorial (o) = 1
    // factorial (n) = n * n-1 * ....1
    // factorial (5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial (n) = n * factorial(n-1)
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    // fibonacci series function!
    static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("The value of factorial n is: " + factorial(x));
        System.out.println("The value of factorial n is: " + factorial_iterative(y));

        // Quick Quiz!
        // Print fibonacci series!
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int m = sc.nextInt();

        System.out.println("The Value of fibonacci number is: ");
        fibonacci(m);
    }
}
