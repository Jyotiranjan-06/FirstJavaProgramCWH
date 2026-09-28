public class methods_overloading_21 {

    static void foo(){
        System.out.println("Welcome to the method Overloading!");
    }

    static void foo(String name){
        System.out.println("Hello " + name + " Have a Good Day!");
    }

    static void foo(int i, int j){
        System.out.println("Age: " + i + "\nMatric Res: " + j);
    }

    static void change(int a){
        a = 45;
    }

    static void change2(int [] arr){
        arr[0]=45;
    }

    static void telljoke(){
        System.out.println("I Inventend a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {
       telljoke();

       // case- 1 changing the integer
        int x = 18;
       change(x);
       System.out.println("The value of x after change is:  " + x);

        // case- 2 changing the Array
        int [] marks = {52, 73, 77, 89, 94};
       change2(marks);
       System.out.println("The value of marks after change is:  " + marks[0]);

       // Method Overloading
        foo();
        foo("Jyotiranjan");
        foo(20,453);
    }
}
