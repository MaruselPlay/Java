import java.util.Scanner;
import java.io.NumberFormatException;

class ElfNameArrayAdvanced{
    public static void main(String[] args){
        System.out.println("The program will ask you for the first letter of your name and for the month you were born.\nBased on the given data, the program will calculate your Elf name");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first letter of your name: ");
        String letter = scanner.nextLine();

        if(letter.length() != 1){
            System.out.print("Input can't be empty or more than one letter long");
            return;
        }

        boolean isNumeric = false;
        try{  
            Double.parseDouble(unverifiedCharacter);
        }catch(NumberFormatException e){
            isNumeric = false;
        }

        if(isNumeric){
            System.out.print("Input must be a letter");
            return;
        }

        char character = letter.charAt(0);
    }
}