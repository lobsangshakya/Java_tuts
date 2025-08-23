// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class buysellrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter apples: ");
        int a = scanner.nextInt();
        System.out.print("Enter mangoes: ");
        int m = scanner.nextInt();
        System.out.print("Enter amount: ");
        int rs = scanner.nextInt();
        
        if (a>m) {
            int buy = rs - (a - m);
            System.out.println(buy);
        }
        else if (a<m) {
            int sell = rs + (a + m);
            System.out.println(sell);
        }
        else if (a==m) {
            System.out.println(rs);
        }
    }
}