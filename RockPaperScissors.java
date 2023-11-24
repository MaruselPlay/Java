import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RockPaperScissors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] avaliableItems = {"rock", "paper", "scissors"};
        String userChoice;
        boolean validInput = false;
        boolean firstInput = true;
        while(true){
            while(!validInput){
                if(firstInput){
                    firstInput = false;
                    System.out.print("Choice rock, paper or scissors: ");
                }else{
                    System.out.print("Wrong choice, choose rock, paper or scissors: ");
                }
                userChoice = scanner.nextLine();
                if(Arrays.asList(avaliableItems).contains(userChoice)){
                    validInput = true;
                }
            }

            String randomComputerChoice = avaliableItems[new Random().nextInt(3)];
            System.out.println("Computer choice " + randomComputerChoice);
            if(randomComputerChoice.equals(userChoice)){
                System.out.println("Draw");
            }else if(randomComputerChoice.equals("rock")){
                if(userChoice.equals("paper")){
                    System.out.println("You've won!");
                }else{
                    System.out.println("You've lost");
                }
            }else if(randomComputerChoice.equals("paper")){
                if(userChoice.equals("scissors")){
                    System.out.println("You've won!");
                }else{
                    System.out.println("You've lost");
                }
            }else if(randomComputerChoice.equals("scissors")){
                if(userChoice.equals("rock")){
                    System.out.println("You've won!");
                }else{
                    System.out.println("You've lost");
                }
            }
        }

       // scanner.close();
}