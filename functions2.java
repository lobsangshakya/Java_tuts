import java.util.Scanner;

public class functions2 {
    static String Hello(int a){
        if (a %2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.println(Hello(a));
    }
}
