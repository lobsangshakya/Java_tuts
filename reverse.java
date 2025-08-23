import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        char a = Character.toUpperCase(sc.next().charAt(0));

        for (char i = 'Z'; i >= a; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
