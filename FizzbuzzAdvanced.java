import java.util.Scanner;

/**
 * Goes from 1 to 100 and outputs FizzBuzz for numbers that can be divided by 3 and 5.
 * If number can't be divided by 3 and 5, it 
 */

class FizzbuzzAdvanced{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter your number for fizz: ");
                int fizzNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter your number for buzz: ");
                int buzzNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter your number for FizzBuzz: ");
                int fizzBuzzNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number you want to count up to: ");
                int number = Integer.parseInt(scanner.nextLine());
                break;
            }catch(Exception e){
                System.out.println("You've entered not valid integer");
            }
        }

        for(int i = 1; i <= number; i++){
            if(i % fizzBuzzNumber == 0){
                System.out.println("FizzBuzz");
            }else if(i % buzzNumber == 0){
                System.out.println("Buzz");
            }else if(i % fizzNumber == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}