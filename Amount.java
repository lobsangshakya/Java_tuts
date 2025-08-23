
import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();
        int result = 0;
        // for(int i = 1; i<=n; i++){
        //     result = result + i;
        // }
        int i = 1;
        // while (i <= n){
        //     result = result + i;
        //     i++;
        // }
        do {
            result = result + i;
            i++;
        }
        while (i<=n);
        System.out.println("The amount is " +result);
        scanner.close();
    }
}
