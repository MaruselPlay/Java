import java.util.Random;

/*
 * Outputs the sum of 4 random rolls
 */

public class RandomDice{
    public static void main(String[] args){
        int rolls = 0;
        for(int i = 0; i < 4; i++){
            rolls += new Random().nextInt(6) + 1;
        }
        double rollsDouble = Double.parseDouble(rolls + "");

        System.out.println(rollsDouble / 4.0);
    }
}
