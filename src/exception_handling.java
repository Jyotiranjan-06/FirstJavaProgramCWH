public class exception_handling {
    public static void main(String[] args) {
        //Try - Catch in Exception Handling
        int [] marks = {97, 98, 95};
        try {
            System.out.println(marks[5]);
        }catch (Exception exception){
            // Do something after catching
        }
        System.out.println("Student Name :- Jyotiranjan");
    }
}
