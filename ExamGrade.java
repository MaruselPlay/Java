import java.util.Scanner;

public class ExamGrade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int highestNumber = 0;

        //for loop, so user can enter score 3 times
        for(int i = 0; i < 3; i++){
            //while loop, so it will repeat until the user has entered a valid number
            while(true){
                System.out.print("Enter test score " + i + ": "); //asking to enter the score
                try{
                    int number = Integer.parseInt(scanner.nextLine()); //converting string to an integer
                    if(number < 0 || number > 100){ //cheking if the integer is in valid grade boundaries
                        System.out.println("Number should be greater or equal to 0 and not higher than 100");
                    }else{
                        if(number > highestNumber){ //this is needed so highest score can be found
                            highestNumber = number;
                        }
                        break;
                    }
                }catch(NumberFormatException exception){ //handled error if user has entered not valid integer
                    System.out.println("Not a valid integer");
                }
            }
        }

        //outputting all the data to the user
        System.out.println("Highest score was " + highestNumber);
        if(highestNumber < 50){
            System.out.println("Grade: Fail");
            System.out.println("Marks over grade boundary: 0");
        }else if(highestNumber <= 59){
            System.out.println("Grade: Pass");
            System.out.println("Marks over grade boundary: " + highestNumber % 50);
        }else if(highestNumber <= 84){
            System.out.println("Grade: Merit");
            System.out.println("Marks over grade boundary: " + highestNumber % 60);
        }else{
            System.out.println("Grade: Distinction");
            System.out.println("Marks over grade boundary: " + highestNumber % 85);
        }
    }
}