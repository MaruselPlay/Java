import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AdvancedFileReader{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BufferedReader fileReader;
        String fileName = "";
        while(true){
            System.out.print("Enter the name of file: ");
            try{
                fileName = scanner.nextLine();
                fileReader = new BufferedReader(new FileReader(fileName)); //opens the file user has entered
                break;
            }catch(FileNotFoundException e){
                System.out.println("File not found");
            }
        }
        int count = 0;
        String line = "";
        int lines = 0;
        linesCounter = new BufferedReader(new FileReader(fileName));
        while (linesCounter.readLine() != null) lines++;
        linesCounter.close();
        String[] = new String[lines];

        while(true){ //while loop to read lines from the file until end
            try{
                line = fileReader.readLine();
            }catch(Exception e){}
            if(line.equals("EOF")){
                break; //breaks the while loop when line in file equals EOF
            }
            count++;
            lines[count] = line; //stores current line in array
            System.out.println(line); //outputs current line
            System.out.println(line); //outputs current count of lines
        }
    }
}