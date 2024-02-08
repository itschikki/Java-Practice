import java.util.Random;
import java.util.Scanner;

class Game{
    int guess;
    int comp;
    //int noOfGuesses = 0;
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    int noOfGuesses =0;

    public void isCorrectNumber(){
        if(guess==comp){
            System.out.println("You guessed the correct no. ");
            System.out.println("You guessed in "+noOfGuesses+" times");

        }

            else if(guess>comp){
                System.out.println("Your number is big, choose something smaller");
                noOfGuesses++;
                Again();



            }
            else if(guess<comp){
                System.out.println("Your number is small,choose something bigger");
                noOfGuesses++;
                Again();

            }
        }
    public void takeUserInput() {
        guess = sc.nextInt();
        System.out.println("you guessed "+ guess);
    }
    public int Game() {
        comp = ran.nextInt(1,100);
        return comp;
    }
    public void Again(){
        System.out.println("Enter no. again :");
        takeUserInput();
        isCorrectNumber();
    }


}

public class guessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        System.out.println("Welcome to guess the number game");
        System.out.println("Enter any number between 1 to 100");
        g.takeUserInput();
        g.Game();
        g.isCorrectNumber();







    }


}
