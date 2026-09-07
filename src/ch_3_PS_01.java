public class ch_3_PS_01 {
    public static void main(String[] args) {

        // (01) Write a Java program to convert a string to lowercase.
        System.out.println("(01) Convert A String To Lowercase: ");
        String name = "Jyoti Ranjan";
        System.out.println("Before: " + name);
        name = name.toLowerCase();
        System.out.println("After: " + name);

        System.out.println();

        // (02) Write a Java program to replace spaces with underscores.
        System.out.println("(02) Replace Spaces With Underscores: ");
        String text = "My Self Jyoti Ranjan Satapathy, And I Am From Bhadrak.";
        System.out.println("Before: " + text);
        text = text.replace(" ", "_");
        System.out.println("After: " + text);

        System.out.println();

        // (03) Write a Java program to fill in a letter templet .
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Jyoti Ranjan");
        System.out.println("(03) Solution: " + letter);

        System.out.println();

        // (04) Write a Java program to detect double and triple spaces in a string.
        System.out.println("(04) Detect Double And Triple Spaces In a String: ");
        String intro = "My Self Jyoti Ranjan Satapathy,  And I Am From   Bhadrak.";
        System.out.println("Double Spaces Index no: " + intro.indexOf("  "));
        System.out.println("Triple Spaces Index no: " + intro.indexOf("   "));

        System.out.println();

        // (05) Write a Java program to format the following letter using escape sequence characters.
        String letter2 = "Dear Jyoti,\n\tThis Java Course is Nice. \nThanks!";
        System.out.println(letter2);
    }
}
