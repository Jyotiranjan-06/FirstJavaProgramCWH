public class string_methods_08 {
    public static void main(String[] args) {
        String name = "Jyoti";      // First Method
        String name1 = new String("Ranajn");     // Second Method
        System.out.println(name + " " + name1);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase() + name1.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase() + name1.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "    Jyoti    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('o','w'));

        System.out.println(name.startsWith("Jyo"));

        System.out.println(name.endsWith("yot"));
        System.out.println(name.endsWith("oti"));

        System.out.println(name.charAt(2));

        System.out.println(name1.indexOf("a"));
        System.out.println(name1.indexOf("a", 3));

        System.out.println(name.lastIndexOf("ti"));

        System.out.println(name.equals("Jyoti"));
        System.out.println(name.equalsIgnoreCase("jyoTi"));

    }
}
