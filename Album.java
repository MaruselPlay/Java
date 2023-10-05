import java.util.Scanner;

public class Album {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter the title: ");
            String title = scanner.nextLine();
            System.out.print("Enter the artist: ");
            String artist = scanner.nextLine();
            System.out.print("Enter the shop section: ");
            char shopSection = scanner.nextLine().charAt(0);
            System.out.print("Enter number of tracks: ");
            int numTracks = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter if in stock: ");
            boolean inStock = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Enter the price: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.println(title);
            System.out.println(artist);
            System.out.println(shopSection);
            System.out.println(numTracks);
            System.out.println(inStock);
            System.out.println(price);
        }catch(NumberFormatException exeption){
            System.out.println("Wrong format");
        }
        scanner.close();
    }
}
