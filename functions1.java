import java.util.Scanner;

public class functions1 {
    public static int power(int a){
        return a*a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.println(power(a));
        sc.close();
    }
}
