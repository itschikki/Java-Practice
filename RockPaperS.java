import java.util.Random;
import java.util.Scanner;
public class RockPaperS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random c = new Random();

        int user=0,comp=0;
        for (int i =0; i<5; i++)
        {
            System.out.println("Select 1 for rock\n Select 2 for paper \n Select 3 for scissors");

            int a = sc.nextInt();
            int b = c.nextInt(1,3);
            switch (a) {
                case 1 -> {
                    System.out.println("you selected rock");
                    if (b == 1) {
                        System.out.println("Computer chooses rock");
                        System.out.println("It's a Tie");
                    }
                    if (b == 2) {
                        System.out.println("Computer chooses paper");
                        System.out.println("You lose");
                        comp+=1;
                    }
                    if (b == 3) {
                        System.out.println("Computer chooses scissors");
                        System.out.println("You won");
                        user+=1;
                    }
                }
                case 2 -> {
                    System.out.println("you selected paper");
                    if (b == 1) {
                        System.out.println("Computer chooses rock");
                        System.out.println("You won");
                        user+=1;
                    }
                    if (b == 2) {
                        System.out.println("Computer chooses paper");
                        System.out.println("It's a tie");
                    }
                    if (b == 3) {
                        System.out.println("Computer chooses scissors");
                        System.out.println("You lose");
                        comp+=1;
                    }
                }
                case 3 -> {
                    System.out.println("you selected scissors");
                    if (b == 1) {
                        System.out.println("Computer chooses rock");
                        System.out.println("You lose");
                        comp+=1;
                    }
                    if (b == 2) {
                        System.out.println("Computer chooses paper");
                        System.out.println("You won");
                        user+=1;
                    }
                    if (b == 3) {
                        System.out.println("Computer chooses scissors");
                        System.out.println("It's a tie");
                    }
                }


            }
            System.out.println("Score:-");
            System.out.println("user : "+user);
            System.out.println("computer:"+comp);
        }

        System.out.println("\nresult after 5 games:-");
        System.out.println("User ="+ user);
        System.out.println("Comp ="+comp);

        }






    }

