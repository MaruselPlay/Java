import java.util.Scanner;
import java.util.Random;

public class ExamGrade{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int highestNumber = 0;
        for(int i = 1; i < 3; i++){
            while(true){
                System.out.print("Enter test number " + i + ": ");
                try{
                    int number = Integer.parseInt(scanner.nextLine());
                    if(number < 0 || number > 100){
                        System.out.println("Number should be greater or equal to 0 and not higher than 100");
                    }else{
                        if(number > highestNumber){
                            highestNumber = number;
                        }
                        break;
                    }
                }catch(NumberFormatException exception){
                    System.out.println("Not a valid number");
                }
            }
        }

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