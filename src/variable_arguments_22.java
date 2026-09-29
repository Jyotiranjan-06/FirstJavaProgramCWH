public class variable_arguments_22 {
    /* static int sum(int a,int b){
        return a + b;
    }

    static int sum(int a,int b, int c){
        return a + b + c;
    }

    static int sum(int a,int b, int c, int d){
        return a + b + c + d;
    } */

    static int sum(int ...arr){
        // Available as int [] arr
        int res = 0;
        for(int x: arr){
            res += x;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of 8 and 9 is: " + sum(8,9));
        System.out.println("The sum of 7, 8 and 9 is: " + sum(7,8,9));
        System.out.println("The sum of 7, 8, 6 and 9 is: " + sum(7,8,6,9));

    }
}
