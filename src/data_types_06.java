public class data_types_06 {
    public static void main(String[] args) {
        int inum = 654 + 53;       //Integer Datatype
        System.out.println(inum);

        float fnum = 6.54f + 3;        // Floating-Point Datatype
        System.out.println(fnum);

        char grade = 'A';       // Character Datatype
        System.out.println("Grade = " + grade);

        // byte: Small integer value (-128 to 127)
        byte a = 100;

        // short: Integer value (-32,768 to 32,767)
        short b = 10000;

        // int: Normal integer value
        int c = 50000;

        // long: Large integer value
        long d = 10000000000L;

        // float: Decimal value (less precision)
        float e = 10.5f;

        // double: Decimal value (more precision)
        double f = 20.5555;

        // char: Single character
        char g = 'A';

        // boolean: True or false
        boolean h = true;

        System.out.println("byte    = " + a);
        System.out.println("short   = " + b);
        System.out.println("int     = " + c);
        System.out.println("long    = " + d);
        System.out.println("float   = " + e);
        System.out.println("double  = " + f);
        System.out.println("char    = " + g);
        System.out.println("boolean = " + h);


        // Increment and Decrement Operators.
        // Post-Increment
        int i = 67;
        System.out.println("Before Post-Increment: " + i++);
        System.out.println("After Post-Increment: " + i);

        //Pre-Increment
        int j = 76;
        System.out.println("Before Pre-Increment: " + ++j);
        System.out.println("After Pre-Increment: " + j);

        //Quick Quiz
        int m = 7;
        int n = ++m * 8;
        System.out.println(n);

        char ch = 'a';
        System.out.println(++ch);

    }
}
