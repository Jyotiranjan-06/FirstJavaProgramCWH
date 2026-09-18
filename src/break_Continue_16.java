public class break_Continue_16 {
    public static void main(String[] args) {
        // Break and Continue Using Loop!
        //Break
        System.out.println("Break Statement Using Loop");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            System.out.println("Java Is Great!");
            if(i == 2){
                System.out.println("Ending The Loop!");
                break;
            }
        }

        System.out.println();

        // Continue
        System.out.println("Continue Statement Using Loop");
        for (int j = 0; j < 10; j++){
            if(j == 2){
                System.out.println("Jump To Next Iteration!");
                continue;
            }
            System.out.println(j);
            System.out.println("Java Is Great!");
        }
    }
}
