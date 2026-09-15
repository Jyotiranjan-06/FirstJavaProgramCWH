import java.util.Scanner;

public class switch_case_12 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an Adult! ");
                break;
            case 23:
                System.out.println("You are going to join a Job! ");
                break;
            case 63:
                System.out.println("You are going to get Retired");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }
        System.out.println("Thanks For Take Your Valuable-Time! ");

    }
}
