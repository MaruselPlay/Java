import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

class BasicFileReader{
    public static void main(String[] args){
        try{
            BufferedReader filereader = new BufferedReader(new FileReader("file.txt")); //creating BufferedReader object to read the contents of the file
            while(true){ //while loop to read all lines
                try{
                    String line = filereader.readLine(); //reading the next line
                    if(line.equals("EOF")){
                        break; //breaking the while loop if we have reached the end of the file
                    }
                    System.out.println(line); //printing current line
                }catch(Exception e){ //catching any errors that potentionaly might come up
                    System.out.println("Failed to read the line");
                    break; //breaking the while loop
                }
            }
            try{
                filereader.close(); //closing the file
            }catch(Exception e){ //catching any errors that potentionaly might come up
                System.out.println("An error occured while closing file");
            }
        }catch(FileNotFoundException e){ //the file doesn't exists
            System.out.println("File not found");
        }
    }
}