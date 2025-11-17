
import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
       
        // Title
        System.out.println("==================================");
        System.out.println("Random Number Guessing Game");
        System.out.println("==================================");

        // Variable
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = 0;
        int guess;
        number = random.nextInt(1, 11);
        
        // Input
        
        do {

            System.out.print("Guess a number between 1-10: ");
            guess = input.nextInt();

            if (guess != number){
                System.out.println("your  guess is incorrect lol");
            }
            else {
            }

            System.out.println();
            
        } while (guess != number);
        
        System.out.println("Congrats dude");
        System.out.println("The correct number is " + number);


        // Process




        input.close(); 
    }
}
