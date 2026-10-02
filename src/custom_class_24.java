class Employee{
    int id;
    String name;
    int age;
    int salary;
    public void printDetail(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class custom_class_24 {

    public  static void main(String[] args) {
        System.out.println("This is our Custom class");
        Employee emp1 = new Employee();    // Instantiating a new Employee object
        Employee emp2 = new Employee();

        // Setting Attributes
        emp1.id = 2006;
        emp1.name = "Jyotiranjan Satapathy";
        emp1.age = 20;
        emp1.salary = 50000;

        emp2.id = 2007;
        emp2.name = "Sanjit Kumar Sahoo";
        emp2.age = 20;
        emp2.salary = 50000;

        // Printing the Attributes
        // System.out.println(jyoti.id);
        // System.out.println(jyoti.name);
        System.out.println("Employee details are: ");
        emp1.printDetail();
        System.out.println();
        emp2.printDetail();
    }
}
