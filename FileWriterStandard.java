import java.util.Scanner;
import java.io.FileWriter;

class FileWriterStandard{

  public String[] dataToWrite = {"Green", "Eggs", "and", "Ham", "EOF"};

  public static void main(String[] args){
    FileWriterStandard self = new FileWriterStandard();
    self.start();
  }

  public void start(){
    writeDataToFile(getFileNameFromUser());
  }

  public String getFileNameFromUser(){
    System.out.println("Enter the name of file: ");
    return new Scanner(System.in).nextLine();
  }

  public void writeDataToFile(String file){
    try{
      FileWriter fileWriter = new FileWriter(file);
      for(int i = 0; i < dataToWrite.length; i++){
        fileWriter.write(dataToWrite[i] + "\n");
      }
      fileWriter.close();
    }catch(Exception e){
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
    System.out.println("Done!");
  }
}