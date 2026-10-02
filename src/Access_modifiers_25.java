class employee1{
    private int id;
    public String name;

    public int getId() {
        return id;
    }
    public void setId(int i){
        this.id = i;
    }

    public String getName(){
        return name ;
    }
    public void setName(String n){
        this.name = n;
    }

}

public class Access_modifiers_25 {
    public static void main(String[] args) {
        employee1 emp1 = new employee1();
        // emp1.id = 45;
        // emp1.name = "Jyotiranjan Satapathy";  --> Through Errors due to Access Modifiers
        emp1.setId(45);
        System.out.println(emp1.getId());
        emp1.setName("Jyotiranjan Satapathy");
        System.out.println(emp1.getName());
    }
}
