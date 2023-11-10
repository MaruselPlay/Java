import java.util.Scanner;
import java.util.Random;

public class SnakesAndLadders{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player 1 name: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter player 2 name: ");
        String player2 = scanner.nextLine();

        boolean gameRunning = true;
        int currentPlayerTurn = 1;
        int player1_score = 0;
        int player2_score = 0;
        while(true){
            int randomDice = new Random().nextInt(6) + 1;
            if(currentPlayerTurn == 1){
                currentPlayerTurn = 2;
                player1_score += randomDice;
                System.out.println(player1 + ", press enter to roll a dice: ");
                scanner.nextLine();
                System.out.println(player1 + ", your score is now " + player1_score);
            }else{
                currentPlayerTurn = 1;
                player2_score += randomDice;
                System.out.println(player2 + ", press enter to roll a dice: ");
                scanner.nextLine();
                System.out.println(player2 + ", your score is now " + player2_score);
            }

            if(player1_score >= 25){
                System.out.println(player1 + ", you won!");
                break;
            }else if(player2_score >= 25){
                System.out.println(player2 + ", you won!");
                break;
            }
            
            int players[] = {player1_score, player2_score};
            int player = 1;
            for(int playerScore : players){
                switch(playerScore){
                    case 3:
                        if(player == 1){
                            player1_score = 22;
                            System.out.println(player1 + ", it is a ladder. Your score is now " + player1_score);
                        }else{
                            player2_score = 22;
                            System.out.println(player2 + ", it is a ladder. Your score is now " + player2_score);
                        }
                        break;
                    case 5:
                        if(player == 1){
                            player1_score = 8;
                            System.out.println(player1 + ", it is a ladder. Your score is now " + player1_score);
                        }else{
                            player2_score = 8;
                            System.out.println(player2 + ", it is a ladder. Your score is now " + player2_score);
                        }
                        break;
                    case 11:
                        if(player == 1){
                            player1_score = 26;
                            System.out.println(player1 + ", it is a ladder. Your score is now " + player1_score);
                        }else{
                            player2_score = 26;
                            System.out.println(player2 + ", it is a ladder. Your score is now " + player2_score);
                        }
                        break;
                    case 20:
                        if(player == 1){
                            player1_score = 29;
                            System.out.println(player1 + ", it is a ladder. Your score is now " + player1_score);
                        }else{
                            player2_score = 29;
                            System.out.println(player2 + ", it is a ladder. Your score is now " + player2_score);
                        }
                        break;
                    case 17:
                        if(player == 1){
                            player1_score = 4;
                            System.out.println(player1 + ", it is a snake. Your score is now " + player1_score);
                        }else{
                            player2_score = 4;
                            System.out.println(player2 + ", it is a snake. Your score is now " + player2_score);
                        }
                        break;
                    case 19:
                        if(player == 1){
                            player1_score = 7;
                            System.out.println(player1 + ", it is a snake. Your score is now " + player1_score);
                        }else{
                            player2_score = 7;
                            System.out.println(player2 + ", it is a snake. Your score is now " + player2_score);
                        }
                        break;
                    case 21:
                        if(player == 1){
                            player1_score = 9;
                            System.out.println(player1 + ", it is a snake. Your score is now " + player1_score);
                        }else{
                            player2_score = 9;
                            System.out.println(player2 + ", it is a snake. Your score is now " + player2_score);
                        }
                        break;
                    case 27:
                        if(player == 1){
                            player1_score = 1;
                            System.out.println(player1 + ", it is a snake. Your score is now " + player1_score);
                        }else{
                            player2_score = 1;
                            System.out.println(player2 + ", it is a snake. Your score is now " + player2_score);
                        }
                        break;
                    default:
                        break;
                }
                player = 2;
            }
        }

        scanner.close();
    }
}