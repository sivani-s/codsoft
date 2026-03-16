import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 1000;
        while (true) {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter amt: ");
                int d = sc.nextInt();
                bal += d;
                System.out.println("Deposited: " + d);
            } else if (ch == 2) {
                System.out.print("Enter amt: ");
                int w = sc.nextInt();
                if (w <= bal) {
                    bal -= w;
                    System.out.println("Withdrawn: " + w);
                } else {
                    System.out.println("Insufficient");
                }
            } else if (ch == 3) {
                System.out.println("Bal: " + bal);
            } else if (ch == 4) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
