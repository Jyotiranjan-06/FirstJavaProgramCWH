public class arrays_operations_18 {
    public static void main(String[] args) {
        int [] marks = {65, 76, 89, 84, 92, 79};   // 3rd Method - Declaration , memory allocation and Initialisation together
        System.out.println(marks[2]);
        System.out.println("Marks Arrays Length: " + marks.length);

        System.out.println();

        String[] students = {"Jyotiranjan", "Dibya Jyoti", "Sanjit", "Janmajaya"};
        System.out.println("Student Array Length: " + students.length);

        // Displaying the Array
        System.out.println("Student Name: " + students[0]);
        System.out.println("Student Name: " + students[1]);
        System.out.println("Student Name: " + students[2]);
        System.out.println("Student Name: " + students[3]);

        System.out.println();

        //Displaying the Array (Using For Loop)
        System.out.println("Displaying Students Marks Using Loop: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println();

        // Qwick Quiz!
        System.out.println("Displaying Students Marks In Reverse Order: ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        System.out.println();

        // For-Each Loop!
        System.out.println("Displaying Students Marks Using For-Each Loop: ");
        for(int element : marks) {
            System.out.println(element);
        }
    }
}
