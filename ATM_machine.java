import java.util.Scanner;

/**
 * ATM
 */
class ATM{
    int Balance = 0;
    int PIN = 1234;
    Scanner sc = new Scanner(System.in);

    public ATM(){
        System.out.println("Enter Your PIN :");
        int inputpin = sc.nextInt();
        if(inputpin==PIN){
            Menu();
        }
        else{
            System.out.println("Please Enter Valid PIN");
            ATM obj = new ATM();
            
        }
    }

    public void Menu(){

        System.out.println("Enter Number to select Options:\n1)Check Balance\n2)Deposit Amount\n3)Withdraw Amount\n4)Exit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: CheckBalance();
                break;
            case 2: Deposit();
                break;
            case 3: Withdraw();
                break;
            case 4: return;              
        
            default: System.out.println("Enter Valid Option\n");
                break;
        }     
    }

    public void CheckBalance(){
        System.out.println("Your Current Balance : "+ Balance);
        Menu();
    }
    
    public void Deposit(){
        System.out.println("Enter amount you want to deposit :");
        int amtDp = sc.nextInt();
        Balance += amtDp;
        System.out.println("Money Deposited Sucessfully!");
        System.out.println("Do you want to check Balance?\n Press 1 for Yes and 2 for No");
        int ch = sc.nextInt();
        if (ch==1) {
           CheckBalance();
        }
        else{
            Menu();
        }
    }

    public void Withdraw(){
        System.out.println("Enter amount you want to withdraw : ");
        int amtWtd = sc.nextInt();
        if (amtWtd>Balance) {
            System.out.println("Insufficient Funds \n");
        }
        else{
            Balance -= amtWtd;
            System.out.println("Amount Withdrawl Sucessfully!\n");
        }
        
        System.out.println("Do you want to check Balance?\n Press 1 for Yes and 2 for No ");
        int ch = sc.nextInt();
        if (ch==1) {
           CheckBalance();
        }
        else{
            Menu();
        }

    }
}

public class ATM_machine {
    public static void main(String[] args) {
        System.out.println("ATM MACHINE\n");
        ATM obj = new ATM();

    }
}