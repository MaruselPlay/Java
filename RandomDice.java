import java.util.Random;

public class RandomDice{
    public static void main(String[] args){
        int rolls = 0;
        for(int i = 0; i < 3; i++){
            rolls += new Random().nextInt(6) + 1;
        }

        System.out.println(rolls);
    }
}