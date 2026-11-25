class Student1 {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

   /* Student1(){     // No-Argument Constructor
        System.out.println("Constructor called");
    }
    */

    /*Student1(Student1 s2){   //Copy - Constructor
        this.name=s2.name;
        this.age=s2.age;
    }
    Student1(){

    }
     */

    Student1(String name,int age){  //Parameterized constructors
        System.out.println("Parameterized constructors called");
        this.name=name;
        this.age=age;
    }
}

public class constructor {
    public static void main(String[] args) {
        /*Student1 s1 = new Student1(); // No-Argument Constructor
        s1.name="Jyotiranjan";
        s1.age = 20;
        s1.printInfo();
         */

        /*Student1 s1 = new Student1();
        s1.name="Sanjit";
        s1.age=19;

        Student1 s2 = new Student1(s1); //Copy - Constructor
        s2.printInfo();
         */

        Student1 s1=new Student1("Sanjit",19);  //Parameterized constructors
        s1.printInfo();
    }
}
