public class arrays_17 {
    public static void main(String[] args) {
        // Classroom of 50 students - You have to store marks of these 500 students

        // int [] marks = new int[5];   // 1st Method - Declaration and memory allocation
        int [] marks;
        marks = new int [5];    // 2nd Method - Declaration and then memory allocation
        // Initialisation
        marks[0] = 85;
        marks[1] = 75;
        marks[2] = 80;
        marks[3] = 65;
        marks[4] = 94;
        System.out.println(marks[3]);

        System.out.println();

        int [] marks2 = {65, 76, 89, 84, 92, 79};   // 3rd Method - Declaration , memory allocation and Initialisation together
        System.out.println(marks2[2]);
    }
}
