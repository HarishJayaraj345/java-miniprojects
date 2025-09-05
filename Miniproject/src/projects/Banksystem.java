package projects;

import java.util.Scanner;

public class Banksystem {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                 
        // Declare variables
        double balance = 100.90;
        boolean isRunning = true;
        int choice;
         
        // Display menu
        while(isRunning) {
            System.out.println("*********************");
            System.out.println("  BANKING PROGRAM  ");
            System.out.println("*********************");
            System.out.println("1. Show Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Exit ");
            System.out.println("*********************");
                      
            // Get and process user choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
         
            switch(choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = balance + deposit();
                    System.out.println("Successfully deposited ");

                    break;
                case 3:
                    balance = balance - withdraw(balance);
                    System.out.println("You have withdrawn sucessfully");

                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        System.out.println("************* Thank you *************");       
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance: $%.2f%n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();
        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        if(amount > balance) {
            System.out.println("Insufficient amount");
            return 0;
        } else if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}
