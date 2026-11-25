class pen{
    String color;
    String type;    //ballpoint & Gel pen
    public void write(){
        System.out.println("Writing Something!");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "Gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printtype();
        pen1.printcolor();

        pen2.printtype();
        pen2.printcolor();

        pen1.write();

        Student s1 = new Student();
        s1.name="Jyotiranjan";
        s1.age = 20;
        s1.printInfo();

        Student s2 = new Student();
        s2.name="Sanjit";
        s2.age = 19;
        s2.printInfo();


    }
}
