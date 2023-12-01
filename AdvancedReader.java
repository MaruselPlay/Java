import java.io.FileReader;
import java.io.BufferedReader;

class AdvancedReader{
    public static void main(String[] args){
        BufferedReader filereader = new BufferedReader(FileReader("file.txt"));
        String[] lines;
        integer count = 0;
        while(true){
            String line filereader.readLine();
            if(line.equals("EOF")){
                break;
            }
            lines[count] = line;
            count++;
            System.out.println(line);
        }
        System.out.println(" linse have been read");
    }
}