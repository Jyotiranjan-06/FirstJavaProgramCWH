public class operators_04 {
    public static void main(String[] args) {
        int a = 18;
        int b = 45 + a;     // Addition
        int c = b - a;      // Substraction
        int d = b * a;      // Multiplication
        int e = b / a;      // Division
        int f = 184 % a;    // Modulo

        int g = 65;
        g += 25;       // Add with Assign
//      g *= 10;       // Mul with Assign
//      g -= 25;       // Sub with Assign
//      g /= 25;       // Div with Assign


        System .out.println(b);
        System .out.println(c);
        System .out.println(d);
        System .out.println(e);
        System .out.println(f);
        System .out.println(g);

        System.out.println( b == 63 );  // Comparision Operator
        System.out.println( 40 > 45 );

        System.out.println( 64 > 23 && 180 < 98 );    //Logical Operator
        System.out.println( 100 > 94 || 130 < 97 );


    }
}
