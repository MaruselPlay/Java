import java.util.Scanner;

class FizzbuzzAdvanced{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //create a scanner object to read the values entered by the user

        while(true){ //while loop to keep asking user for input, until it will be valid
            try{
                //asking user for input and assigning it to variables
                System.out.print("Enter your number for fizz: ");
                int fizzNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter your number for buzz: ");
                int buzzNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter your number for FizzBuzz: ");
                int fizzBuzzNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number you want to count up to: ");
                int number = Integer.parseInt(scanner.nextLine());
                //output data
                for(int i = 1; i <= number; i++){ //for loop to count from 0 to whatever number user has entered
                    if(i % fizzBuzzNumber == 0){ //decide if the number is division by the number user has entered for FizzBuzz
                        System.out.println("FizzBuzz");
                    }
                    if(i % buzzNumber == 0){
                        System.out.println("Buzz"); //decide if the number is division by the number user has entered for Buzz
                    }
                    if(i % fizzNumber == 0){
                        System.out.println("Fizz"); //decide if the number is division by the number user has entered for Fizz
                    }
                    System.out.println(i); //output current count
                }
                break; //breaks the while loop if no error has occured
            }catch(Exception e){
                System.out.println("You've entered not valid integer"); //error message to the user
            }
        }
        scanner.close(); //closing the scanner 
    }
}