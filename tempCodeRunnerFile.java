import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner H = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        char a = H.next().charAt(0);
        for (char i = 'Z'; i>=a; i++){
            System.out.println(i+ " ");
        }
        H.close();
    }
}
