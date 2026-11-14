public class casting {
    public static void main(String[] args) {
        // Casting
        double price = 100.00;
        double finalprice = price + 18;  //Implicit Casting

        System.out.println("Final Price :- " + finalprice);

        int p = 100;
        int fp = p + (int)18.0;  //Explicit Casting
        System.out.println("Final Price :- " + fp);
    }
}
