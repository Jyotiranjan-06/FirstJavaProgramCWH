public class functions {

    public static void printJava(){
        System.out.println("Hello Java!");
    }

    public static void printName(String name){
        System.out.println("Hello! " + name);
    }

    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        //Methods/Functions
        printJava();
        printName("Jyotiranjan");
        sum(18,45);
    }
}
