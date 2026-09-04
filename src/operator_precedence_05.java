public class operator_precedence_05 {
    public static void main(String[] args) {
//        Precedence & Associativity

        int a = 6*5-34/2;
        /*
            = 30 - 34/2
            = 30-17
            = 13
        */
        System.out.println(a);

        int b = 60/5-34*2;
        /*
            = 12 - 34 * 2
            = 12 - 68
            = -56
        */
        System.out.println(b);

        // Quick Quiz
        int x = 5;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

    }
}
