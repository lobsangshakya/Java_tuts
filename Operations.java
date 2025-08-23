import java.util.Scanner;

public class Operations {
    // Switch_Case
        static int Operations(int a, int b, int c){
            switch (c) {
                case 1:
                    return a+b;
                case 2:
                    return a-b;
                case 3:
                    return a*b;
                case 4:
                    return a/b;
                default:
                    return 100;
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.print("Enter c: ");
            int c = sc.nextInt();
            System.out.println(Operations(a, b, c));
        // Condition State - if else if 
        // if (c == 1){
        //     System.out.println(a+b);
        // }
        // else if (c == 2) {
        //     System.out.println(a-b);
        // }
        // else if (c == 3) {
        //     System.out.println(a*b);
        // }
        // else if (c == 4) {
        //     System.out.println(a/b);
        // }
        }
}
