import java.util.Scanner;

/**
 * Goes from 1 to 100 and outputs FizzBuzz for numbers that can be divided by 3 and 5.
 * If number can't be divided by 3 and 5, it 
 */

class FizzbuzzStandard{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}