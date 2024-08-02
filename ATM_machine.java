import java.util.Scanner;

// ATM class handles the main functionality of the ATM machine
class ATM{
    int Balance = 0; // Variable to store the current balance
    int PIN = 1234; 
    Scanner sc = new Scanner(System.in); // Scanner object to read user input

    // Constructor to initialize the ATM and prompt for PIN entry
    public ATM(){
        System.out.println("Enter Your PIN :");
        int inputpin = sc.nextInt(); // Read the entered PIN
        if(inputpin == PIN){ // Check if entered PIN is correct
            Menu();
        }
        else{
            System.out.println("Please Enter Valid PIN");
            ATM obj = new ATM(); // Reinitialize ATM for another attempt
        }
    }

    // Method to display the menu options and handle user choice
    public void Menu(){
        System.out.println("\nEnter Number to select Options:\n1)Check Balance\n2)Deposit Amount\n3)Withdraw Amount\n4)Exit");
        int ch = sc.nextInt(); // Read user choice
        switch (ch) {
            case 1: 
                CheckBalance(); 
                break;
            case 2: 
                Deposit();
                break;
            case 3: 
                Withdraw();
                break;
            case 4: 
                return; // Exit the menu
            default: 
                System.out.println("Enter Valid Option\n"); // Invalid option handling
                break;
        }     
    }

    // Method to display the current balance
    public void CheckBalance(){
        System.out.println("Your Current Balance : " + Balance);
        Menu(); // Return to menu after displaying balance
    }
    
    // Method to handle the deposit of amount
    public void Deposit(){
        System.out.println("Enter amount you want to deposit :");
        int amtDp = sc.nextInt(); // Read deposit amount
        Balance += amtDp; // Add deposit amount to balance
        System.out.println("Money Deposited Successfully!");
        System.out.println("Do you want to check Balance?\n Press 1 for Yes and 2 for No");
        int ch = sc.nextInt(); // Read user choice to check balance
        if (ch == 1) {
            CheckBalance(); // Call method to check balance
        }
        else{
            Menu(); // Return to menu
        }
    }

    // Method to handle the withdrawal of amount
    public void Withdraw(){
        System.out.println("Enter amount you want to withdraw : ");
        int amtWtd = sc.nextInt(); // Read withdrawal amount
        if (amtWtd > Balance) {
            System.out.println("Insufficient Funds \n"); // Check for insufficient funds
        }
        else{
            Balance -= amtWtd; // Deduct withdrawal amount from balance
            System.out.println("Amount Withdrawn Successfully!\n");
        }
        
        System.out.println("Do you want to check Balance?\n Press 1 for Yes and 2 for No ");
        int ch = sc.nextInt(); // Read user choice to check balance
        if (ch == 1) {
            CheckBalance(); // Call method to check balance
        }
        else{
            Menu(); // Return to menu
        }
    }
}

// Main class to run the ATM program
public class ATM_machine {
    public static void main(String[] args) {
        System.out.println("ATM MACHINE\n");
        ATM obj = new ATM(); // Create an instance of ATM class to start the program
    }
}
