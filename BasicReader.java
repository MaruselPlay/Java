import java.io.FileReader;
import java.io.BufferedReader;

class BasicReader{
    public static void main(String[] args){
        BufferedReader filereader = new BufferedReader(FileReader("file.txt"));
        while(true){
            String line filereader.readLine();
            if(line.equals("EOF")){
                break;
            }
            System.out.println(line);
        }
    }
}