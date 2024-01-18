import java.util.Scanner;
import java.io.FileWriter;

class FileWriterStandard{

  public String[] dataToWrite = new Array[10];

  public static void main(String[] args){
    FileWriterStandard self = new FileWriterStandard();
    self.start();
  }

  public void start(){
    try{
      FileWriter fileWriter = new FileWriter(file);
      int count = 0;
      String[] lines = getLinesFromUser();
    }catch(Exception e){
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
  }

  public String[] getLinesFromUser(){
    new Scanner(System.in).nextLine()
    do{

    }
    System.out.println("Enter the name of file: ");
    return new Scanner(System.in).nextLine();
  }

  public void writeLines(FileWriter fileWriter, String[] lines){
    for(int i = 0; i < lines.length; i++){
      fileWriter.write(lines[i] + "\n");
    }
    fileWriter.close();
    System.out.println("Done!");
  }
}