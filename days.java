import java.util.Scanner;

public class days {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (1-7): ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Its Sunday.");
                break;
            case 2:
                System.out.println("Its Monday.");
                break;
            case 3:
                System.out.println("Its Tuesday.");
                break;
            case 4:
                System.out.println("Its Wednesday.");
                break;
            case 5:
                System.out.println("Its Thursday.");
                break;
            case 6:
                System.out.println("Its Friday.");
                break;
            case 7:
                System.out.println("Its Saturday.");
                break;
        
            default:
            System.out.println("Poco dek");
                break;
        }
    }
}
