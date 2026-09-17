import java.util.Scanner;
public class for_Loop_15 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Qwick Quiz!");
        System.out.println("Print n Odd numbers: ");
        // 2n = Even Number = 2, 4, 6, 8, 10
        // 2n+1 = Odd Number = 1, 3, 5, 7, 9

        int n = 50;
        for(int i = 0; i < n; i++){
            System.out.println(2*i+1);
        }

        System.out.println();

        System.out.println("Decrementing For Loop!");
        for(int m = 5; m >= 1; m--){
            System.out.println(m);
        }

        System.out.println();
        System.out.println("Qwick Quiz!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        // Print numbers from n to 1
        for (int j = num; j >= 1; j--) {
            System.out.println(j);
        }

    }
}
