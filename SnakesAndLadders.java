import java.util.Scanner;
import java.util.Random;

public class SnakesAndLadders{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player 1 name: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter player 2 name: ");
        String player2 = scanner.nextLine();

        int rolls = 0;
        for(int i = 0; i < 3; i++){
            rolls += 6 - new Random().nextInt(5);
        }

        System.out.println(rolls);

        scanner.close();
    }
}