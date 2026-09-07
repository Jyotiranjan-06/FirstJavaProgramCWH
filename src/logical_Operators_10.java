public class logical_Operators_10 {
    public static void main(String[] args) {
        int age = 20;
        int marks = 75;

        // AND (&&)
        // Both conditions must be true
        if (age >= 18 && marks >= 40) {
            System.out.println("AND: Both conditions are true");
        } else {
            System.out.println("AND: Both conditions are not true");
        }


        // OR (||)
        // At least one condition must be true
        if (age >= 18 || marks >= 90) {
            System.out.println("OR: At least one condition is true");
        } else {
            System.out.println("OR: Both conditions are false");
        }


        // NOT (!)
        // Changes true to false and false to true
        if (!(age >= 18)) {
            System.out.println("NOT: Age is less than 18");
        } else {
            System.out.println("NOT: Age is 18 or above");
        }
    }
}
