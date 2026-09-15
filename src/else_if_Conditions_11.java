import java.util.Scanner;

public class else_if_Conditions_11 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 56){
            System.out.println("You Are Experienced! ");
        }
        else if (age > 46){
            System.out.println("You Are Semi-Experienced! ");
        }
        else if (age > 36){
            System.out.println("You Are Semi-Semi-Experienced! ");
        }
        else {
            System.out.println("You Are Not Experienced! ");
        }
    }
}
