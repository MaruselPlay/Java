import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

class BasicReader{
    public static void main(String[] args){
        while(true){
            try{
                BufferedReader filereader = new BufferedReader(new FileReader("file.txt"));
                while(true){
                    try{
                        String line = filereader.readLine();
                        if(line.equals("EOF")){
                            break;
                        }
                        System.out.println(line);
                    }catch(Exception e){
                        System.out.println("Failed to read the line");
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("File not found");
            }
        }
    }
}