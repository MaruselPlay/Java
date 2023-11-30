import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RockPaperScissors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] avaliableItems = {"rock", "paper", "scissors"}; //creating an array with all item we can use, so we don't need to hardcode them every time
        String userChoice = "";
        boolean validInput = false;
        boolean firstInput = true;
        while(!validInput){ //while loop to aks user for their chose until it's valid
            if(firstInput){ //to make different message for first unput and every after
                firstInput = false;
                System.out.print("Choice rock, paper or scissors: ");
            }else{
                System.out.print("Wrong choice, choose rock, paper or scissors: ");
            }
            userChoice = scanner.nextLine();
            if(Arrays.asList(avaliableItems).contains(userChoice)){ //checks if the item entered by the user is in list of items
                validInput = true;
            }
        }

        String randomComputerChoice = avaliableItems[new Random().nextInt(3)]; //chosing random item for computer
        System.out.println("Computer choice " + randomComputerChoice); //showing computer random item to user

        //deciding if the user has won, lost or neither (draw)
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
        scanner.close();
    }
}