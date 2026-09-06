import java.util.Scanner;

public class strings_07 {
    public static void main(String[] args) {
        // String name = new String("Jyoti");
        String name = "Jyoti";
        System.out.print("The name is: ");
        System.out.println(name);

        int a = 6;
        float b = 8.1106f;
        System.out.printf("The value of a is %d and value of b is %f \n", a, b );

        System.out.print("Enter Values: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}
