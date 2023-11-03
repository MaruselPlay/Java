import java.util.Scanner;

/*
* Asks the parameters of swimming pool, calculates and outputs the perimeter and the volume of the swimmingpool.
*/

public class SwimmingPool{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the pool in metres: ");
        String lengthString = scanner.nextLine();

        System.out.print("Enter the width of the pool in metres: ");
        String widthString = scanner.nextLine();

        System.out.print("Enter the depth of the pool in metres: ");
        String depthString = scanner.nextLine();

        scanner.close();

        try{
            double length = Double.parseDouble(lengthString);
            double width = Double.parseDouble(widthString);
            double depth = Double.parseDouble(depthString);

            System.out.println("The perimeter is " + ((length * 2) + (width * 2)));
            System.out.println("The volume is " + length * width * depth);
        }catch(NumberFormatException exeption){
            System.out.println("Some of data entered, wasn't a valid number");
        }
    }
}