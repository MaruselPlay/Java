import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AdvancedFileReader{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter the name of file: ");
            try{
                String fileName = scanner.nextLine();
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName)); //opens the file user has entered

                //The following block of code counts the number of lines in the file, to create a fixed length array later
                int linesCount = 0;
                try{
                    BufferedReader linesCounter = new BufferedReader(new FileReader(fileName));
                    while(linesCounter.readLine() != null) linesCount++;
                    linesCounter.close();
                }catch(Exception e){
                    System.out.println("An error occured while reading the file");
                }

                String[] linesToStore = new String[linesCount];
                linesCount = 0;
                String line = "";
                while(true){ //while loop to read lines from the file until end
                    try{
                        line = fileReader.readLine(); //reading next line from the file
                    }catch(Exception e){
                        System.out.println("Failed to read the line");
                        break; // breaking the while loop
                    }
                    if(line.equals("EOF")){
                        break; //breaks the while loop when line in file equals EOF
                    }
                    linesToStore[linesCount] = line; //stores current line in array
                    linesCount++;
                    System.out.println(line); //outputs current line
                    System.out.println(linesCount); //outputs current count of lines
                }

                try{
                    fileReader.close(); // closing the file
                }catch(Exception e){ // catching any errors that potentionaly might come up
                    System.out.println("An error occured while closing file");
                }
                break;
            }catch(FileNotFoundException e){ //file entered by the user, not found
                System.out.println("File not found");
            }
        }
        scanner.close();
    }
}