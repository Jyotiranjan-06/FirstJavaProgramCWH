import java.util.Scanner;

public class ch_1_PS_01 {
    public static void main(String[] args) {

//      (1) Write a program to sum three numbers in Java.
        System.out.println(" Print Of Sum Three Numbers! ");
        int a = 74;
        int b = 27;
        int c = 89;
        int sum = a + b + c;
        System.out.println(sum);


//      (2) Write a program to calculate CGPA using marks of three subjects (out of 100).
        System.out.println(" Calculate CGPA Using Marks Of Three Subjects! ");
        float sub1 = 67;
        float sub2 = 82;
        float sub3 = 92;
        float cgpa = (sub1 + sub2 + sub3) / 30;
        System.out.println(cgpa);


//      (3) Write a program which asks the user to enter his/her name and greets them with "Hello <Name> have a good day" text.
        System.out.println("Greats To User With Their Name! ");
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Habe a Good Day! ");


//      (4) Write a program to convert kilometers to miles.
        System.out.println("Convert Kilometers To Miles! ");
        System.out.print("Enter kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Miles = " + miles);


//      (5) Write a program to detect whether a number entered by the user is integer or not.
        System.out.println("Detect Number Entered By User INTEGER or Not! ");
        System.out.println("Enter Your Number: ");
        int number = sc.nextInt();
        System.out.println(sc.hasNextLine());

    }
}
