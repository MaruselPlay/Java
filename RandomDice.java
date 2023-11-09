import java.util.Random;

public class RandomDice{
    public static void main(String[] args){
        int rolls = 0;
        for(int i = 0; i < 3; i++){
            rolls += 6 - new Random().nextInt(5);
        }

        System.out.println(rolls);
    }
}