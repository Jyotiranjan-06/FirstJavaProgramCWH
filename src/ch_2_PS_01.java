import java.util.Scanner;

public class ch_2_PS_01 {
    public static void main(String[] args) {
        // (01) What will be the result of the following expression float a = 7/4 * 9/2 .
        System.out.println("(01) Result Of Expression Float a = 7/4 * 9/2: ");

        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);


        // (2) Write a program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade .
        System.out.println("(02) Encrypt a grade by 8 and Show Decrypted Correct Grade ");

        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypting the Grade
        grade = (char) (grade - 8);
        System.out.println(grade);


        // (03) Use comparison operators to find out whether a given number is greater than the user entered number or not.
        System.out.println("(03) Find Greater Them The User Entered Number Or Not: ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x > 18);

    }
}
