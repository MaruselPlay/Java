import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

class BasicFileReader{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BufferedReader fileReader;
        String fileName 
        while(true){
            System.out.print("Enter the name of file: ");
            try{
                fileReader = new BufferedReader(new FileReader(scanner.nextLine())); //opens the file user has entered
                break;
            }catch(FileNotFoundException e){
                System.out.println("File not found");
            }
        }
        int count = 0;
        String line = "";
        int lines = 0;
        while (fileReader.readLine() != null) lines++;
        reader.close();
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