import java.util.Scanner;

public class EnrolmentStandard{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        while(name.isEmpty() || name.length() <= 1){
            System.out.print("Name can't be empty. Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.print("Enter the year you were born: ");
        String yearTemp = scanner.nextLine();
        int year;
        try{
            year = Integer.parseInt(yearTemp);
        }catch(Exception exeption){
            year = -1;
        }

        while(year < 0){
            System.out.print("Year can't be less than 0. Enter the year you were born: ");
            yearTemp = scanner.nextLine();
            try{
                year = Integer.parseInt(yearTemp);
            }catch(Exception exeption){
                year = -1;
            }
        }

        System.out.print("Enter your math GCSE score: ");
        String mathGcseTemp = scanner.nextLine();
        int mathGcse;
        try{
            mathGcse = Integer.parseInt(mathGcseTemp);
        }catch(Exception exeption){
            mathGcse = -1;
        }

        while(mathGcse < 1 || mathGcse > 9){
            System.out.print("Score can't be lower than 1 or greater than 9. Enter your math GCSE score: ");
            mathGcseTemp = scanner.nextLine();
            try{
                mathGcse = Integer.parseInt(mathGcseTemp);
            }catch(Exception exeption){
                mathGcse = -1;
            }
        }

        scanner.close();
        System.out.println("Name: " + name);
        System.out.println("Year born: " + year);
        System.out.println("Math GCSE: " + mathGcse);
    }
}